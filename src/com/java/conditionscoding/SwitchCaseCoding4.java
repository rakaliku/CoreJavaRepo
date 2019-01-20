//Swith Cse sample program
package com.java.conditionscoding;

public class SwitchCaseCoding4 {

	public static void main(String[] args)
	{
		byte b=127;
		switch(b)
		{
		//case 150:
			//System.out.println("no match");
			
		case 127:
			System.out.println("matched");
			System.out.println("2nd statement of the matched case ");
			break;
		default:
			System.out.println("default statement");
		}
	}
}
