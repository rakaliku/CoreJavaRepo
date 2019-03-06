package com.java.abstraction;

class NormalMethodClass
{
	void normalMethod()
	{
		System.out.println("---over ridden method of anormal class---");
		System.out.println("                                   ");
	}
}
abstract class StaticCode extends NormalMethodClass
{
	{
		System.out.println("instance block of abstract class");
		System.out.println("                                   ");
	}
	static {
		System.out.println("static block of abtract class");
		System.out.println("                                   ");
	}
	StaticCode()
	{
		System.out.println("********abstract class constructor codes************");
		System.out.println("                                   ");
	}
	void staticCodeMethod()
	{
		System.out.println("-------***abstract class normal method***");
		System.out.println("                                   ");
	}
	 abstract int staticCodeAbstractMethod();
	 
	 abstract void normalMethod();
	
}
public class AbstractClassStaticCode extends StaticCode {

	void normalMethod()
	{
		System.out.println("%%%%overridding a abstract method");
		System.out.println("                                   ");
	}
	void staticCodeMethod()
	{
		System.out.println("***normal class normal method whcih overriding of abstract class nromal method***");
		System.out.println("                                   ");
	}
	{
		System.out.println("instance block of the mani method class");
		System.out.println("                                   ");
	}
	static {
		System.out.println("$$$static block of the main method class$$$");
		System.out.println("                                   ");
	}
	int staticCodeAbstractMethod()
	{
		System.out.println("&&&abstract class abstract method implementation&&&");
		System.out.println("                                   ");
		return 2;
	}
	public static void main(String[] args)
	{
		
	//new AbstractClassStaticCode().staticCodeMethod();
		AbstractClassStaticCode a1= new AbstractClassStaticCode();
		a1.staticCodeMethod();
		a1.normalMethod();
	new AbstractClassStaticCode().staticCodeAbstractMethod();
	StaticCode s=(StaticCode)a1;
	s.staticCodeMethod();
	
	//StaticCode s2=new StaticCode();
	/*Abstract class object cannot possible*/
	
	NormalMethodClass n=new NormalMethodClass();
	n.normalMethod();
	}
}

