/*
 * Teststart för github Grupp 6 i Objektorientreade Applikationer
 */

public class Main {
	
	public static void main(String[] args) {
		GUI graphic = new GUI();
		
		Thread thread = new Thread(){
			public void run()
			{
				try{
					System.out.println("Thread Start");
					Thread.sleep(1000);
					System.out.println("Slept 1 sec in thread");
				}catch (InterruptedException e)
				{
					
				}
				
			}
		};
		thread.start();
		
		graphic.stressTest();
	}

}
