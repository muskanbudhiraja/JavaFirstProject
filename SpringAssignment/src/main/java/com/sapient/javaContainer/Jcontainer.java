package com.sapient.javaContainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Jcontainer {
	
	@Bean
	public Employee f1()
	{
		Employee obj=new Employee();
		return obj;
	}

}
