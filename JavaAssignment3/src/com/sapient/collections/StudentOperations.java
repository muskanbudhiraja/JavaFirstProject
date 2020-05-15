package com.sapient.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentOperations implements Comparator<Student>{
	
	private static ArrayList<Student> students=new ArrayList<Student>();
	
	public static void readStudent(Student st)
	{
		students.add(st);
	}
	static void displayStudents()
	{
		for(Student st:students)
			System.out.println(st);
	}
	static void DisplayDetails(int id)
	{
		int count=0;
		for(Student st:students)
		{
			if(st.getId()==id)
			{
				count=1;
				System.out.println(st);
				break;
			}
			
		}
		if(count==0)
			System.out.println("NO STUDENT FOUND!!");
	}
	public static void StudentOfParticularCity(String city)
	{
		int count=0;
		for(Student st:students)
		{
			if((st.getCity()).equals(city))
			{
				System.out.println(st);
				count++;
			}
		}
		if(count==0)
			System.out.println("NO STUDENT FOUND!!");
		
	}
//	List<String> nameSortList()
//	{
//		List<String> list=new ArrayList<>();
//		for(Student st:students) {
//			list.add(st.getName());
//		}
//		Collections.sort(list);
//		return list;
//	}
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	static class NameSortList implements Comparator<Student>
	{
		public int compare(Student a,Student b) {
			return a.getName().compareTo(b.getName());
		}
		
	}
	static class CitySortList implements Comparator<Student>
	{
		public int compare(Student a,Student b) {
			return a.getCity().compareTo(b.getCity());
		}
		
	}
	static void nameSortList()
	{
		Collections.sort(students,new NameSortList());
		displayStudents();
		
	}
	static void citySortList()
	{
		Collections.sort(students,new CitySortList());
		displayStudents();
	}
	
	
}
