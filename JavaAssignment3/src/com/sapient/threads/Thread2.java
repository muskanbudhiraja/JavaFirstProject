package com.sapient.threads;

public class Thread2 extends Thread{
	
	public void run()
	{
		while(ThreadRunner.count<10)
		   {
			   if(ThreadRunner.lock==true)
			   {System.out.println("-toc");
			   
			   ThreadRunner.lock=false;
			   ThreadRunner.count++;}
			   
		   }
	}

}
