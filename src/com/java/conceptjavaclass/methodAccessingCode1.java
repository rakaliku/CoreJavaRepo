package com.java.conceptjavaclass;

public class methodAccessingCode1 {

	void method1()
	{
		System.out.println("void method statement ");
	}
	static void method2()
	{
		System.out.println("method 2 is static one");
	}
	public static void main(String [] args)
	{
		method2();
		new methodAccessingCode1().method1();
	}
	
}
