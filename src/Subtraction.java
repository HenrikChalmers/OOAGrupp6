package subtraction.model;

import java.lang.Thread;

public class Subtraction extends Thread
{
	public Subtraction(){
		
	}
	
	public void run(){
		System.out.println("Subtraction started");
		try{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Subtraction finished");
	}

}
