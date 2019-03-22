
package com.java.exceptionalhandlingcodes;
import com.java.userexcptions.*;
/*Throw Keyword hand over the user created exception to JVM*/

public class ThrowKeywordCode1 extends  InvalidAgeException{
	
	int printMethod()
	{
		System.out.println("to use ThrowKeywordCode1");
		return 2;
	}

	public static void main(String[] args) //throws InvalidAgeException
	{
		new ThrowKeywordCode1().printMethod();
		
		try
		{
			InvalidAgeException i=new InvalidAgeException();
			i.methodInvalidAge();
		}
		catch(InvalidAgeException i)
		{
			System.out.println("User defined Exception is handled here");
			
		}
	}
}


