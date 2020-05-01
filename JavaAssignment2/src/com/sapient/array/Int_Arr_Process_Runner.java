package com.sapient.array;

public class Int_Arr_Process_Runner {

	public static void main(String[] args) {
		
		Int_Arr_Process process=new Int_Arr_Process(5);
		process.readArray(new int[]{10,5,10,6,4});
		process.displayVertically();
		process.displayHorizontally();
		System.out.println("The biggest element is:"+process.biggestNumber());
		System.out.println("The smallest element is:"+process.smallestNumber());
		System.out.println("The sum of all elements is:"+process.sumOfElements());
		process.sortArray();
		System.out.println("array after sorting:");
		process.displayHorizontally();
		System.out.println("The second biggest element is:"+process.secondBiggest());
	}

}
