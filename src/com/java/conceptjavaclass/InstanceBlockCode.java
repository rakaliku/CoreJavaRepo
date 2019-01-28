package com.java.conceptjavaclass;

public class InstanceBlockCode {

	
	{
		System.out.println("instance block statements");
	}
	InstanceBlockCode()
	{
		System.out.println("constructor statement");
	}
	{
		System.out.println("instance block after the constructor block but its printing before theconstructor only ");
	}
	public static void main(String [] args)
	{
		new InstanceBlockCode();
	}
}
