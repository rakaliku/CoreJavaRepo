package com.java.abstraction;

abstract class Test3
{
	Test3()
	{
		System.out.println("Abstract class  constructor");
	}
	void methodTest3()
	{
		System.out.println("test3 abstract lass method");
	}
	
}
public class AbstractClassCode2 extends Test3{
	
	AbstractClassCode2()
	{
		System.out.println("normal constructor");
	}

	public static void main(String[] args) {
		/*Test3 t=*/new AbstractClassCode2();
		AbstractClassCode2 t1=new AbstractClassCode2();
		
		Test3 t2=(Test3)t1;                //        ???????????????/
		t2.methodTest3();
		//Test3 t3=new Test3(); 
		/*Abstract class constructor object canot create*/
	}
	
	
}
