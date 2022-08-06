package com.areaofcircle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AreaOfCircleConfig {

	@Bean
	public AreaOfCircle area() {
	
		return new AreaOfCircle(7);
	}
}
