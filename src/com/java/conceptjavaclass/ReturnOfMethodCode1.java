package com.java.conceptjavaclass;

class P {}
//class Y {}
public class ReturnOfMethodCode1 {

	P m1()
	{
		System.out.println("return type of m1 method is X class reference object");
		P p=new P();
		return p;
	}
	public static void main(String [] args)
	{
		new ReturnOfMethodCode1().m1();
		P p1=new ReturnOfMethodCode1().m1();
		System.out.println("main method1 ");
		System.out.println(p1);
	}
}
