package com.sapient.threads;


public class Thread1 extends Thread{

	
	public void run()
	{
		while(ThreadRunner.count<10)
		{
			if(ThreadRunner.lock==false)
			{   if(ThreadRunner.count<10)
				System.out.print(" tic");
			
			ThreadRunner.lock=true;
			
			}
		}
	}
		
}
