package com.java.oopscodings;

public class TypeCstingCode {

	
	public static void main(String [] args)
	{
		//implicit type casting done by COMPILER
		byte b=10;
		short s=9;
		int i=s;
		System.out.println(i);
		System.out.println(b);
		
		float n= 598;
		double d=n;
		System.out.println(d);
		
		char ch='z';
		double d1=ch;
		System.out.println(d1);
		
		//Explicit type casting is done by USER as below
		double d2=52.36;
		float num=(float)d2;
		System.out.println(num);
		
		float f2=54;
		short s2=(short)f2;
		System.out.println(s2);
	}
}
