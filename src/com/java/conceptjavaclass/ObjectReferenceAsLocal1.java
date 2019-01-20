package com.java.conceptjavaclass;
class Emp
{}
class X{}
class Y {}
public class ObjectReferenceAsLocal1 {

	void m1(Emp e, X x)
	{
		System.out.println("m1 method");
		System.out.println(e);
	}
	public static void main(String [] args)
	{
		Emp e=new Emp();
		X x=new X();
		new ObjectReferenceAsLocal1().m1(e, x);	
	}
	
	
}
