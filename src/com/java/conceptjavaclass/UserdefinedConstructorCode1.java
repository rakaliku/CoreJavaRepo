package com.java.conceptjavaclass;

public class UserdefinedConstructorCode1 {

	UserdefinedConstructorCode1()
	{
		System.out.println("1st construtor statement");
	}
	UserdefinedConstructorCode1(int a)
	{
		
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		UserdefinedConstructorCode1 u1=new UserdefinedConstructorCode1();
		new UserdefinedConstructorCode1(50);
		System.out.println(u1);
	}
	
}
