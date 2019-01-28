
package oopscodings;

//import com.java.stringexamples;----Its wrong , because I have not given * or class name which will be used in below coding
import com.java.stringexamples.StringPrinting;

public class InheritanceCoding extends StringPrinting  {

	 
	
	public static void main(String [] args)
	{
//below CollegeClassDetails class is in different class of same package still  
//no need of extends the class to use
	new CollegeClassDetails().admin();	

/*below 	StringPrinting class is defined in different package i.e com.java.stringexample
still no extend keyword required to use this package's class but method should be public
*/	new StringPrinting().method();
	/*Why here method needs to public in its class even after the respective
	class in extended here for inheritance*/
	
	}
}
