//Coding for If condition
package com.java.conditionscoding;

public class IfElseClass1 {

	public static void main(String[] args) {
		int num1=4;
		int num2=6;
		int num3=2;
				if (num1>=num2 && num1>=num3)
				{
					System.out.println("laregest no.="+num1);
				}
				else if(num2>=num1 && num2>=num3)
				{
					System.out.println("laregest no.="+num2);
				}
				else
					System.out.println("laregest no.="+num3);
	}

}
