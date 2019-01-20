package com.java.conceptjavaclass;

public class ConversionOfLocalToInstanceCode1 {

	int val1=100;
	int val2=300;
	void values(int val1,int val2)
	{
		System.out.println(val1);
		System.out.println(val2);
		
		/* Coversion of local variable to Instance variable as below 
		 this.val1=val1;
		 this.val2=val2;
*/		
		System.out.println(this.val1);
		System.out.println(this.val2);
		
	}
	public static void main(String[] args)
	{
		new ConversionOfLocalToInstanceCode1().values(2589, 6547);
		
	}
	
}
