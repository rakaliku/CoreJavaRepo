package com.java.oopscodings;

//PAGE-83---

class Marks
{
	int m1,m2,m3;
	Marks(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(this.m1);
	}
}
//Implicit super constructor Marks() is undefined for default constructor. Must define an explicit constructor
//why above comment is coming as WARNING????
public class CompositionCoding extends Marks{

	public static void main(String [] args)
	{
	//Marks m=new Marks(10,20,30);
		//new CompositionCoding();
		new Marks(1,2,5);
	}
}
