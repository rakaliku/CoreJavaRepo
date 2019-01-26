package com.java.conditionscoding;

public class BreakAndContinueCode {

	
	static void  method()
	{
		int x=1;
		if (x==5)
		{
			if(x>2)
			//	continue;
			System.out.println(x);
			x++;
			
		}
	}
	static void breakMethod()
	{
		for (int y=0;y<4;y++)
		{
			if(y==2)
				break;
			System.out.println(y);
		}
	}
	public static void main(String[] args)
	{
		breakMethod();
	}
}
