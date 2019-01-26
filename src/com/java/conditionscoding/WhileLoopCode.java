package com.java.conditionscoding;

public class WhileLoopCode {

	static int whileCallMethod()
	{
		int x=0;
		while(x<9)
		{
			if(x<3) {
			System.out.println(x);
			x++;
			}
			else 
			{
				System.out.println("done");
				x++;
			}
		}
		System.out.println("less that 3");
		return 2;
	}
	public static void main(String [] args)
	{
		whileCallMethod();
	}
	
	
}
