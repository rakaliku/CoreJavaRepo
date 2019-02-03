package com.java.conceptjavaclass;

class Cricket
{
	 Cricket(int a){
		System.out.println("cRICKET CONSTRUCTOR STATEMENT");
	} 
}
public class ConstructorDefaultCreation {

	ConstructorDefaultCreation(int b)
	{
	System.out.println("0-args constructor");	
	}
	public static void main(String[] args)
	{
		// new Cricket();
		new Cricket(5);
		 new ConstructorDefaultCreation(2);
		 //new ConstructorDefaultCreation();
	}
}
