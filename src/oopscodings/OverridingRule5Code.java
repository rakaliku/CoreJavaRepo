package oopscodings;

   /*Below coding is not MethodRidding
   this is called METHOD HIDING*/
   
class Parent
{
	static void m1()
	{
		System.out.println("parent m1 method");
	}
}
public class OverridingRule5Code extends Parent {

	static void m1()
	{
		System.out.println("child class method");
	}
	public static void main(String [] args)
	{
		Parent p=new OverridingRule5Code();
		p.m1();
	}
}
