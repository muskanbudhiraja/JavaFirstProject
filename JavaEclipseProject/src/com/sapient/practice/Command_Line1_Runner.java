package com.sapient.practice;

public class Command_Line1_Runner {

	public static void main(String[] args) {
		
		Command_Line1 line=new Command_Line1();
		line.setData(20,10,12);
		line.displayData();
		System.out.println(line.sumData());
		System.out.println(line.avgData());
		System.out.println(line.biggestData());
		System.out.println(line.smallestData());
	}

}
