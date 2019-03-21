package com.java.exceptionalhandlingcodes;

public class ThrowsKeywordAtMainMethod {

	@SuppressWarnings({ "deprecation", "static-access" })
	void detailsMethod() throws InterruptedException  //throws InterruptedException//ArithmeticException //
	{
		//System.out.println("Checked Excpetion are being handled by Main Method");
		//System.out.println(500/0);
		Thread.sleep(20);
	
		System.out.println("------------------");
	}
	public static void main(String[] args) throws InterruptedException //throws InterruptedException
	{
		new ThrowsKeywordAtMainMethod().detailsMethod();
	}
}
