package com.java.conceptjavaclass;

public class ReturnOfUserDefinedClassVariableCode1 {

	Employee multipicationMethoD(int m1, int m2)
	{
		int mult=m1*m2;
		System.out.println("Multipication of m1 and m2 is ="+mult);
		Employee e=new Employee();
		return e;
	}
	public static void main(String[] args) {
		
		new ReturnOfUserDefinedClassVariableCode1().multipicationMethoD(50, 4);
		System.out.println(new Employee().num1);/* Employee class variable 
		printing statement */
		
		new Employee().methodOfEmployee();
		
		
	}

}
