package com.java.conceptjavaclass;

public class InstanceBlockCode {

	
	{
		System.out.println("instance block statements");
	}
	InstanceBlockCode()
	{
		System.out.println("constructor statement");
	}
	public static void main(String [] args)
	{
		new InstanceBlockCode();
	}
}
