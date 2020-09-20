package com.programm;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		int marks;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Marks");

		marks=sc.nextInt();


		if(marks>=35 && marks<=50)
		{
			System.out.println("Grade D");
		}
		else if(marks>50 && marks<=70)
		{
			System.out.println("Grade C");
		}
		else if(marks>70 && marks<=90)
		{
			System.out.println("Grade B");
		}
		else if(marks>90 && marks<=100)
		{
			System.out.println("Grade A");
		}
		else {
			System.out.println("FAil");
		}
	}
}
