package com.java.conceptjavaclass;

public class InitialingInstanceVariable {

	int eid;
	{
		 eid=505;
		 System.out.println("instance block eid is "+eid);
	}
	InitialingInstanceVariable()
	{
		eid=100;//why 100 printed as output
	}
	void display()
	{
		System.out.println("eid is "+eid );
	}
	public static void main(String [] args)
	{
		new InitialingInstanceVariable().display();//its printing both instnce block and constructor
		new InitialingInstanceVariable();
	}
}
