package com.programm;

public class Arrays {

	public static void main(String[] args) {

		String [] cars= {"Honda","Volvo","BMW","Maruti"};
		int [] num= {10,20,30,40,50};

		System.out.println(cars[1]);
		System.out.println(num[3]);

		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}

		for(int c:num)
		{
			System.out.println(c);
		}
	}

}
