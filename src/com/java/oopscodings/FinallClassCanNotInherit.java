package com.java.oopscodings;

final class Test
{
	void testMethod()
	{
		System.out.println("test method statement");
	}
}

public final class FinallClassCanNotInherit {

	 void method()
	{
		System.out.println("final class can not be inherit ");
	}
	public static void main(String[] args) {
		//method();
		new Test().testMethod();
	}
	
}
