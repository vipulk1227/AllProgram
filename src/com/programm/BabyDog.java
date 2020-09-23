package com.programm;

public class BabyDog extends Dog{

	public void weep()
	{
		System.out.println("Weeping");
	}
	
	public static void main(String[] args) {
		
         BabyDog b=new BabyDog();
         b.weep();
         b.bark();
         b.eat();
         
	}

}
