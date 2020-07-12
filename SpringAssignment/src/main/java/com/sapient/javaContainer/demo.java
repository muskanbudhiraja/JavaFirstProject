package com.sapient.javaContainer;

public class demo {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Press 1 to enter details of employee");
			System.out.println("Press 0 to search the employee");
			System.out.println("Press 2 to quit");
			
			int en=read.scanner.nextInt();
			if(en==1)
			{
				EmployeeList.details();
			}
			else if(en==0)
			{
				System.out.println("Enter the id of the employee to be searched");
				int id=read.scanner.nextInt();
				Employee emp=EmployeeList.search(id);
				System.out.println(emp); 
			}
			else {
				break;
			}
		}
			
		
	}

}
