package com.programm;

public class For1 {

	public static void main(String[] args) {

		// printing star

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("-");
			}
			for(int k=1;k<=5+1-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}