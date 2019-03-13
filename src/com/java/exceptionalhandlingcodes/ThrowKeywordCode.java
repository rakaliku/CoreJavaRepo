package com.java.exceptionalhandlingcodes;

public class ThrowKeywordCode {

	void studentDetails() throws InterruptedException
	{
		System.out.println("student name is rakesh sahoo")		;
		Thread.sleep(1000);
		
	}
	void hod() throws InterruptedException
	{
		studentDetails();
	}
	void principal()
	{
		try {
			hod();
		}
		catch (InterruptedException ie)
		{
			System.out.println(ie.toString());
			System.out.println(ie.getMessage());
			ie.printStackTrace();
		}
		
	}
	public static void main(String[] args)
	{
		ThrowKeywordCode t=new ThrowKeywordCode();
		t.principal();
	}
}
