import java.util.*;
class ComplexMain
{
	public static void main(String args[])
	{
		Complex c1=new Complex();
		Complex c2=new Complex();
		
		
		c1.setValue(30,40);
		c2.setValue(20,10);
		

		System.out.println("first Complex number");
		c1.display();
		System.out.println("Second Complex number");
		c2.display();
		
		System.out.println("Addition of two Complex number");
		Complex c3;
        c3 = c1.sum(c2);
		
        c3.display();
		
		
	}
}