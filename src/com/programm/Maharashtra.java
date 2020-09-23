package com.programm;

public class Maharashtra extends Bank{

	int a=40;
	void display()
	{
		System.out.println("This is Maharashtra bank");
	}

	public static void main(String []args) {
		Maharashtra mah=new Maharashtra();

		Bank b=new Maharashtra(); //upcasting

		((Maharashtra)b).display();
		Maharashtra m=(Maharashtra)b; //downcasting
		System.out.println(m.a);
		m.display();


	}
}
