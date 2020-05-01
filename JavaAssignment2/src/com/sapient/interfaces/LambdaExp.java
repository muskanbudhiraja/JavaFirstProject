package com.sapient.interfaces;

import java.util.Scanner;

interface Num_Process {
	abstract int cal(int a,int b);
}

public class LambdaExp {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		System.out.println("Press 1.add \n2.subtract \n3.multiply \n4.divide");
		int choice=scanner.nextInt();
		Num_Process process=(a,b)-> {
			return a+b;
		};
		System.out.println(process.cal(num1,num2));
		scanner.close();
	}

}
