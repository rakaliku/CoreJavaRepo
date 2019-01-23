package com.java.conceptjavaclass;

public class InitializingSameValuesToVariable {

	
	int a;
	int b;
	int p;
	InitializingSameValuesToVariable()
	{
		int a=5;
		int b=9;
		int p=87;
		System.out.println(""+a+"" +""+ b + p);
		System.out.println(a);
		System.out.println(b);
		System.out.println(p);
	}
	public static void main(String [] args)
	{
			new InitializingSameValuesToVariable();
			new InitializingSameValuesToVariable(); 
	/*above 2 statement will print same value even if both are diffrent abject*/ 
	}
}
