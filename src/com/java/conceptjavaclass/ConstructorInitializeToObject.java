package com.java.conceptjavaclass;

public class ConstructorInitializeToObject {

	
	int sid;
	String sname;
	void studentDetialsMethod()
	{
		System.out.println("student id is"+sid);
		System.out.println("student name is"+sname);
	}
	public void main(String [] args)
	{
		ConstructorInitializeToObject t=new ConstructorInitializeToObject();
		t.studentDetialsMethod();
	}
}
