package com.sapient.collections;


public class StudentRunner {

	public static void main(String[] args) {
		
		Student[] student=new Student[5];
		System.out.println("Enter details of 5 students:");
		for(int i=0; i<5; i++) {
			student[i]=new Student();
			student[i].read();
	}
//		Student[] student=new Student[5];
//		student[0]= new Student(1,"Michael","gurgaon");
//		student[1]= new Student(2,"Sara","bangalore");
//		student[2]= new Student(3,"Rahul","noida");
//		student[3]= new Student(4,"Raghav","bangalore");
//		student[4]= new Student(5,"Rohan","pune");
		
		for(int i=0; i<student.length; i++)
			StudentOperations.readStudent(student[i]);
		System.out.println("Displaying all students:");
		StudentOperations.displayStudents();
		
		System.out.println("\nEnter city:");
		String city=readinput.sc.next();
		StudentOperations.StudentOfParticularCity(city);
		
		System.out.println("\nEnter id:");
		int id=readinput.sc.nextInt();
		StudentOperations.DisplayDetails(id);
		
		System.out.println("\nDisplay students name wise sorted:");
		StudentOperations.nameSortList();
		
		System.out.println("\nDisplay students city wise sorted:");
		StudentOperations.citySortList();
	}

}
