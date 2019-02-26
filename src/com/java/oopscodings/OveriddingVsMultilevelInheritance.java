package com.java.oopscodings;

class Person
{
	void eat()
	{
		System.out.println("4-idly");
	}
	
}
class Ratan extends Person
{
	void eat()
	{
		System.out.println("10 -idly");
	}
}
class RatanKid extends Ratan
{
	void eat()
	{
		System.out.println("2 -idly");
	}
}
public class OveriddingVsMultilevelInheritance {

	public static void main(String [] args)
	{
		Person p=new Ratan();
		p.eat();//10-idly
		
		Ratan r=new RatanKid();
		r.eat();//2-idly
		
		Person p1=new RatanKid();
		p1.eat();//2-idly
		
		//RatanKid r1=new Ratan();
		//CHILD CLASS OBJECT CAN NOT HOLD PARENT CLASS
		
		//below codes are primitive
		RatanKid r1=(RatanKid)r;
		r1.eat();
		
		Ratan r2=(Ratan)p;
		r2.eat();
	}
}
