package gui.model;

public class GUI{
	
	public GUI(){
		System.out.println("GUI window constructor");
	}
	
	public void stressTest(){
		//Work thread test
		for(int i = 0; i<=1000 ; i++){
			if(i%250 == 0){
				System.out.println("SUB" + i);
			}
		}
		System.out.println("GUI stressTest() finished");
	}
}
