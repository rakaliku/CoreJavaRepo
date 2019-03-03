package com.java.abstraction;

abstract class Test {
	Test(){
		System.out.println("abstract class constructor");
	}
}
public class AbstractClassConstructor extends Test{

	public static void main(String[] args) {
	AbstractClassConstructor a=new AbstractClassConstructor();
	//Test t=(Test)a;
	System.out.println("raka");
	}
	
}
