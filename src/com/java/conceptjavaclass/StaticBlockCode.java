package com.java.conceptjavaclass;

public class StaticBlockCode {

	
	static {
		System.out.println("static block statement");
	}
	StaticBlockCode()
	{
		System.out.println("constructor block statement ");
	}
	{
		System.out.println("instance block statement");
	}
	public static void main(String [] args)
	{
		new StaticBlockCode();
	}
}
