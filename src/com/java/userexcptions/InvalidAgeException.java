package com.java.userexcptions;

public class InvalidAgeException extends Exception{

	public void methodInvalidAge() throws InvalidAgeException
	{
		System.out.println("invalid age method");
		throw new InvalidAgeException();
	}
}
