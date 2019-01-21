package com.java.conceptjavaclass;

public class ConstructorClassAdvantages {

	
	int eid;
	String ename;
	double esal;
	void display()
	{
		System.out.println("****employee details*******");
		System.out.println("employee name "+ename);
		System.out.println("employee salary"+esal);
		System.out.println("employee id"+eid);
		
		
	}
	public static void main(String[] args)
	{
		ConstructorClassAdvantages e1= new ConstructorClassAdvantages();
		e1.display();
		/*Ouput will be the default bvalues of the variables*/
	}
}
