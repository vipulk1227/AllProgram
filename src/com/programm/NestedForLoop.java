package com.programm;

public class NestedForLoop {

	public static void main(String[] args) {
		// 

		for(int i=1;i<3;i++)
		{
			for(int j=1;j<10;j++)   // execute inner loop first
			{
				System.out.println(i+""+j);
			}
		}


	}

}
