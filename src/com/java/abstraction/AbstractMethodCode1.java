package com.java.abstraction;

abstract class Method
{
	abstract void empDetails();
	abstract int salaryDetails();
	
}
public class AbstractMethodCode1 extends Method{
			
					void empDetails()
					{
						String EmpName="rakesh sahoo";
								System.out.println("emp name is "+EmpName );
					}
					int salaryDetails()
					{
						int sal1=52000;
						System.out.println("salary of emp is "+sal1);
						return sal1;
					}
					public static void main(String [] args)
					{
						AbstractMethodCode1 m2=new AbstractMethodCode1();
						Method m1=(Method) m2;
						m1.empDetails();
						m1.salaryDetails();
					}
					
	
}
