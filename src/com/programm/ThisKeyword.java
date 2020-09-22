package com.programm;

public class ThisKeyword {

	int roll;
	String name,course;
	float fees;

	public ThisKeyword(int roll,String name,String course)
	{
		this.roll=roll;
		this.name=name;
		this.course=course;
	}

	public ThisKeyword(int roll,String name,String course,float fees)
	{
		this(roll,name,course);
		this.fees=fees;

	}
	public void display()
	{
		System.out.println("roll no is:"+roll+"name is :"+"course is :"+course+"fees is :"+fees);
	} 
	public static void main(String[] args) {

		ThisKeyword t=new ThisKeyword(101, "vip", "BE");
		ThisKeyword t1=new ThisKeyword(102, "Raj", "CIVIL", 5000);
		t.display();
		t1.display();
	}

}
