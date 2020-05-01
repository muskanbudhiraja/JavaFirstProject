package com.sapient.array;

import java.util.Arrays;

public class Int_Arr_Process {

	private int[] array;
	public Int_Arr_Process()
	{
		array=new int[10];
	}
	public Int_Arr_Process(int size) {
		array=new int[size];
	}
	public Int_Arr_Process(int size,int[] arr) {
		array=new int[size];
		for(int i=0;i<size;i++)
			array[i]=arr[i];
	}
	public Int_Arr_Process(Int_Arr_Process ob) {
		//this.array= ob.array.clone();
		this.array=new int[ob.array.length];
		for(int i=0; i<ob.array.length; i++)
			this.array[i]=ob.array[i];
		
	}
	
	void readArray(int[] value)
	{
		for(int i=0; i<array.length; i++)
			array[i]=value[i];
	}
	void displayHorizontally()
	{
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
		System.out.print("\n");
	}
	void displayVertically()
	{
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}
	int biggestNumber()
	{
		int max=Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		return max;
	}
	int smallestNumber()
	{
		int min=Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]<min)
				min=array[i];
		}
		return min;
	}
	int sumOfElements() 
	{
		int sum=0;
		for(int i=0; i<array.length; i++)
			sum+=array[i];
		return sum;
	}
	void sortArray()
	{
		Arrays.sort(array);
	}
	int secondBiggest()
	{
		sortArray();
		int size=array.length;
		return array[size-2];
	}
}
