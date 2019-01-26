package com.java.conceptjavaclass;

public class PrefixOperatorCode1 {

	
	static void method1()
	{
		int x=5;
		//int y;
		int  y=x++;
		System.out.println(y);
		
		//int z=++y;
		int z=++x;
		System.out.println(z);
		
		int b=++z;
		
		System.out.println(b);
	}
	public static void main(String [] args)
	{
		method1();
	}
}
