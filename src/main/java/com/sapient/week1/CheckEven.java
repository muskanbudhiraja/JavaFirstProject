package com.sapient.week1;

public class CheckEven 
{
    public static void main(String[] args)
    {
	System.out.println(check(5));
	System.out.println(check(21));
	System.out.println(check(98));   
    }
    public static boolean check(int n)
    {
    	boolean val;
    	if(n%2==0)
    	    val=true;
    	else
    	    val=false;
    	return val;
    }
}
