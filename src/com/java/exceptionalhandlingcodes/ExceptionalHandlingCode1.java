package com.java.exceptionalhandlingcodes;

public class ExceptionalHandlingCode1 {

	public static void main(String [] args)
	{
		try
		{
			System.out.println("     try block ");
			try
			{
				int[] a= {5,6,7};
				System.out.println(a[5]);
			}catch(ArrayIndexOutOfBoundsException a1)
			{
				int[] a= {5,6,7};
				System.out.println(a[1]);
				System.out.println("");
			}
			
			System.out.println(10/0);
			
		}
		catch(ArithmeticException  ae)
		{
			ae.printStackTrace();
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());
			System.out.println("     catch block     ");
			System.out.println(10/2);
		}
		finally
		{
			System.out.println("finally block stement");
		}
	}
	
	
}
