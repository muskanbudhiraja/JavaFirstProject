package com.sapient.practice;

import java.util.ArrayList;

public class Command_Line1 {
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	void setData(int... values)
	{
		for(int val:values)
			list.add(val);
	}
	void displayData()
	{
		for(int val:list)
			System.out.println(val+" ");
	}
	int sumData() {
		int sum=0;
		for(int val:list)
			sum+=val;
		return sum;
	}
	double avgData() {
		int sum=sumData();
		return ((double)sum)/list.size();
	}
	int biggestData()
	{
		int max=Integer.MIN_VALUE;
		for(int val:list)
		{
			if(val>max)
				max=val;
		}
		return max;
	}
	int smallestData()
	{
		int min=Integer.MAX_VALUE;
		for(int val:list)
		{
			if(val<min)
				min=val;
		}
		return min;
	}
}
