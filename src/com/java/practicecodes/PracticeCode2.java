package com.java.practicecodes;

public class PracticeCode2 {

	public static void main(String [] args)
	{
		try {
			Double number =Double.valueOf(12D);
			System.out.println(number);
		}
	//	System.out.println("inside statement");
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
			
		}
		//System.out.println(number);
		System.out.println("print staement of outised TRY AND CATCH BLOCK");
	//number variable is only having the scope in TRY Block
	}
}
