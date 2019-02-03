package oopscodings;

class Marks
{
	int m1,m2,m3;
	Marks(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		System.out.println(m1);
		System.out.println(this.m1);
	}
}

public class CompositionCoding extends Marks{

	public static void main(String [] args)
	{
	//Marks m=new Marks(10,20,30);
		//new CompositionCoding();
		Marks c=	new Marks(1,2,5);
	}
}
