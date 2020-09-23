package com.programm;

public class Inheritance1 extends Inheritance {

	String name="vipul";

	public void display1()
	{
		System.out.println("Name is :"+name);
	}

	public static void main(String []args) {

		Inheritance1 i=new Inheritance1();
		i.display();
		i.display1();

	}
}
