package oopscodings;

					/*page-100
				Runtime polymorphism*/

class Bike
{
	void run()
	{
		System.out.println("running");
	}
}
class Splender extends Bike
{
	void run()
	{
		System.out.println("splender class method");
	}
}
class Unicorn extends Bike
{
	void run()
	{
		System.out.println("unicorn method");
	}
}
public class RuntimePolymorphism {
	
	public static void main(String[] args)
	{
		Bike b1=new Splender();
		b1.run();
		//b1.run();
		Bike b2= new Unicorn();
		b2.run();
		
		Bike b3=new Bike();
		b3.run();
	}

	
}
