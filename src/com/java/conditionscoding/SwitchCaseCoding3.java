package com.java.conditionscoding;

public class SwitchCaseCoding3 {

	public static void main(String[] args)

	{
		String s = "raka";
		switch (s) {
		/*
		 * case 56://type mismatch error 
		 * System.out.println("not matched"); 
		 * break;
		 */
		case "rak":
			System.out.println("not matched");
			break;
		case "raka":
			System.out.println("case matched");
			break;
		}

	}
}
