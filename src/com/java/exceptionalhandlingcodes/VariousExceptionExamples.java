package com.java.exceptionalhandlingcodes;

public class VariousExceptionExamples {

	VariousExceptionExamples()
	{
      		try
      		{
      			String s= new String("rakesh");
      			Object o=(Object)s;
      	                System.out.println(s);
      	                System.out.println("class cast exception statement");
      			Object oo=new Object();
      			String str=(String)oo;
      		}
      		catch(ClassCastException ce)
      		{
      			System.out.println("constructor class excption is handleD");
      		}
	}
	static {
		try
		{Thread t1=new Thread();
		t1.start();
		t1.start();
		}
		catch(IllegalThreadStateException i4)
		{
			System.out.println("illegalthreadsafe exception is hadnle in the static block");
			
		}
		{
			try
			{
				String s="rakeshsahoo";
				System.out.println(s.charAt(86));
			}
			catch(StringIndexOutOfBoundsException so)
			{
				System.out.println("string index out of bounds exception is handled");
			}
		}
	}
	static void exceptionMethod()
	{
		Thread t=new Thread();
		t.setPriority(11);
		/*try
		{
			Thread t=new Thread();
			t.setPriority(11);
		}
		catch(IllegalArgumentException i)
		{
			System.out.println("illegal argument exception is handled");
		}*/
	}
	public static void main(String [] args)
	{
		try {
               new VariousExceptionExamples();
		}
		catch(ClassCastException ce)
		{
			//this catch block will not be executed
			//because in the constructor itself exception is handled
			System.out.println("class cast exception is handled");
		}
		//exceptionMethod();
		try
		{
			exceptionMethod();
		}
		catch(IllegalArgumentException i)
		{
			System.out.println("/n");
			System.out.println("illegalArgumentException is handled ");
			
			
		}
		try
		{
			
			try
			{
				String str1="raka";
						int b=Integer.parseInt(str1);
				System.out.println(b);
			}
			catch(NumberFormatException n)
			{
			System.out.println("number format exception is handled");
				
			}
			int[] a= {1,5,7,3};
			System.out.println(a[6]);
			
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			a1.printStackTrace();
			
			int[] a= {1,5,7,3};
			System.out.println("----------------------------/n");
			System.out.println(a[2]);
			System.out.println(a1.getMessage());
			System.out.println(a1.getStackTrace());
			System.out.println("----------------------------/n");
			
			try
			{
				String str2=null;
				System.out.println(str2.length());
			}
			catch(NullPointerException ne)
			{
				System.out.println("null pointer exception is handled here");
				
			}
		}
		
	}
}
