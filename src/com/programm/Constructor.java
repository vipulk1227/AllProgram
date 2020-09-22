package com.programm;

public class Constructor {

	int id;
	String name;

	public Constructor(int i,String j)
	{
		id=i;
		name=j;

	}
	public void display1()
	{
		System.out.println("id is:"+id+" name is :"+name);
	}

	/*public void display2()
	{
		System.out.println("this is default construtor");
	}*/
	public static void main(String[] args) {

		//Constructor c1=new Constructor();//default contructor
		//c1.display2();

		Constructor c2=new Constructor(100, "vipul");
		c2.display1();


	}

}
