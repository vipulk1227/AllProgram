package com.programm;

public class Honda extends Bike{


	void run() {
		
	    System.out.println("running");
	}

	
	void sit() {
		
		System.out.println("Sitting");
	}

	public static void main(String[] args) {


          Honda h=new Honda();
          h.run();
          h.sit();
	}

	
}
