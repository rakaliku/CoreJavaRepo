package com.java.practicecodes;

public class PracticeCode1 {

	public static void main(String[] args)
	{
		int sum=0;
//		int x;
		System.out.println("sum");
		for (int x=0; x<=10;x++)
			sum +=x;
//		System.out.println("Sum for 0 to "+ x);
		
	//compilation error will come as x is not declared in local	
		
		System.out.println("="+sum);
	}
}
