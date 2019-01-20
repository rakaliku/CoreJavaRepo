package com.java.conditionscoding;

public class SwitchCaseCoding1 {

	public static void main(String [] args)
	{
		int a=10;
		switch(a)
		{
		case 10:
			System.out.println("argument is matchin gand value="+a);
			//break;
		case 'l':
		System.out.println("false");
		//break;//                                          If we are not giving BREAK then all CASE and DEFAULT section will get print		
		default:
			System.out.println("this is default section");
		}
	}
}
