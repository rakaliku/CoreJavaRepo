package com.java.exceptionalhandlingcodes;

public class ThrowsKeywordAtMainMethod {

	void detailsMethod() throws InterruptedException
	{
		System.out.println("Checked Excpetion are being handled by Main Method");
		//System.out.println(500/0);
		Thread.sleep(56);
		System.out.println("------------------");
	}
	public static void main(String[] args) throws InterruptedException
	{
		new ThrowsKeywordAtMainMethod().detailsMethod();
	}
}
