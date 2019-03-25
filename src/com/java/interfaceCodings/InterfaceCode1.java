package com.java.interfaceCodings;

interface it3
{
	void m4();
	    interface it4
	    {
	    	void m5();
	    }
}
interface it2
{
	void m3();
}
interface it1 extends it2
{
	abstract void m1();
	abstract void m2();
}
public class InterfaceCode1 implements it1,it2{

	public  void m1()
	{
		System.out.println("abstract method 1 statement");
	}
	public void m2()
	{
		System.out.println("abstract method 2 statement");
	}
	public void m3()
	{
		System.out.println("m3 method");
	}
	public void m4()
	{
		System.out.println("m4 method");
	}
	public void m5()
	{
		System.out.println("m5 method");
	}
	public static void main(String[] args)
	{
		new InterfaceCode1().m1();
		
		//Interface can hold the implementation class object
		it1 i=new InterfaceCode1();
		i.m2();
		
		it2 i2=new InterfaceCode1();
		i2.m3();
		
		//it3 i3=new InterfaceCode1();
		//i3.m4();
		
		new InterfaceCode1().m5();
	}
}
