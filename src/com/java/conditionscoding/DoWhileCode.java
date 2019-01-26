package com.java.conditionscoding;

public class DoWhileCode {

	
	String doWhileMethod()
	{
		int num=5;
		do
		{
			System.out.println(num);
			num++;
		}while(num<13);
		return "ra";
	}
	public static void main(String [] args)
	{
		DoWhileCode d=new DoWhileCode();
		d.doWhileMethod();
	}
}
