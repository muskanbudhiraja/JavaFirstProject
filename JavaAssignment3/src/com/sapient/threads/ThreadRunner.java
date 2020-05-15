package com.sapient.threads;

public class ThreadRunner {
	
	public static boolean lock=false;
	public static int count=0;

	public static void main(String[] args) {

			
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
		
	}

}
