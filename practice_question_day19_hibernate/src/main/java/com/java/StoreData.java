package com.java;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import javax.persistence.Query;

public class StoreData {

public static void main(String[] args) {

  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
  SessionFactory factory = meta.getSessionFactoryBuilder().build();

  Session session = factory.openSession();
  Transaction t = session.beginTransaction();

	  Employee e1 = new Employee();
	
	  System.out.println("Create operation...");
	  
	  e1.seteId(101);
	  e1.seteName("Shubham");
	  e1.setSalary(70000.0f);
	  
	  session.save(e1);
	  System.out.println("successfully saved");
	  
	  System.out.println();
	  System.out.println("Read Operation...");
	  
	  Query query=session.createQuery("from Employee");//here persistent class name is Employee
	  @SuppressWarnings("unchecked")
	  List<Employee>list = query.getResultList();
	  for(Employee e: list) {
		  System.out.println(e.geteId()+" "+e.geteName()+" "+e.getSalary());
	  }
	  System.out.println("Data fetched/read successfully");
	  
	  System.out.println();
	  System.out.println("Update operation...");
	  
	  query=session.createQuery("update Employee set salary=:amt where eId=:n");//here persistent class name is Employee
	  query.setParameter("amt", 50000.0f);
	  query.setParameter("n", 40);
	  int status=query.executeUpdate();
	  System.out.println("successfully updated "+status+" record.");

	  System.out.println();
	  System.out.println("Delete Operation...");
	  
	  query=session.createQuery("delete from Employee where eId=:ID");
	  query.setParameter("ID", 10);
	  status=query.executeUpdate();
	  
	  t.commit();
	  System.out.println("Successfully deleted "+status+" record.");
	  
	  factory.close();
	  session.close();

	}

}