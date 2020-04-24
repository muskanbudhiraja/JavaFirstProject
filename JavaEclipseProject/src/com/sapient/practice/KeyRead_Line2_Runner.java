package com.sapient.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyRead_Line2_Runner {

	private static Scanner scanner;

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		KeyRead_Line2 keyRead = new KeyRead_Line2();

		scanner = new Scanner(System.in);

		System.out.print("Enter the value of n : ");
		int n = scanner.nextInt();

		System.out.println("Enter" + n + "numbers; ");
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

		keyRead.readData(list);
		keyRead.displayData();

		keyRead.sort();
		keyRead.displayData();

		System.out.print("Enter the number to find : ");
		int f = scanner.nextInt();
		keyRead.find(f);

	}

}
