package com.java.conceptjavaclass;

public class ReturnOfThisKeyword {

	
	static ReturnOfThisKeyword m1()
	{
		System.out.println("m1 method");
		ReturnOfThisKeyword t=new ReturnOfThisKeyword();
		return t;
	}
	ReturnOfThisKeyword m2()
	{
		System.out.println("m2 method");
		return this;
	}
	public static void main(String [] args)
	{
		m1();
		System.out.println(new ReturnOfThisKeyword().m2());
	}
}
