package com.sapient.xmlContainer;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class demo {

	static Scanner scanner =new Scanner(System.in);

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
		
		EmployeeList obj=(EmployeeList)context.getBean("empl");
		//System.out.println(obj);
		int no=scanner.nextInt();
		System.out.println(obj.getMap().get(no));
		
		
	}

}
