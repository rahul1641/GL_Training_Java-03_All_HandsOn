package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
	
	public Connection getConnection()throws Exception {

		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

		 return con;

		 }
	
	  @RequestMapping("/customer")
	  public String display(@RequestParam("name") String name,@RequestParam("add") String add,@RequestParam("ph") String ph,@RequestParam("gen") String gen,@RequestParam("martialStatus") String martialStatus, Model m) throws SQLException, Exception

	  {
		  
		  String query = "insert into customer values(?,?,?,?,?)";
		  PreparedStatement ps = getConnection().prepareStatement(query);
		  
		  ps.setString(1, name);
		  ps.setString(2, add);
		  ps.setString(3, ph);
		  ps.setString(4, gen);
		  ps.setString(5,martialStatus);
		  
		  ps.executeUpdate();
		  System.out.println("Registered successfully in the database...");
	   
	      m.addAttribute("message", name);
	      m.addAttribute("address", add);
	      m.addAttribute("phone", ph);
	      m.addAttribute("gender", gen);
	      m.addAttribute("status", martialStatus);

	      return "viewpage";

	  }
}
