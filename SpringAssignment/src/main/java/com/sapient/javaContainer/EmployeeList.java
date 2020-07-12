package com.sapient.javaContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeList {

	private static List<Employee> list=new ArrayList<Employee>();

	public static void details() {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(com.sapient.javaContainer.Employee.class);
		Employee ob=context.getBean(Employee.class);
		
		System.out.println("enter id, name and city of employee");
		int id=read.scanner.nextInt();
		String name=read.scanner.next();
		String city=read.scanner.next();
		
		ob.setId(id);
		ob.setName(name);
		ob.setCity(city);
		
		list.add(ob);
		for(Employee em:list)
		{
			System.out.println(em);
		}
	
}
	public static Employee search(int id) throws NoSuchElementException {
				
		for(Employee em:list)
		{
			if(em.getId()==id) 
				return em;				
		}
		throw new NoSuchElementException();
	}
}
