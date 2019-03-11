import java.util.*;
class DistanceMain
{
	public static void main(String args[])
	{
		Distance d1=new Distance();
		Distance d2=new Distance();
		Distance d3;
		
		d1.setValue(5,40);
		d2.setValue(7,10);

		System.out.println("first distance");
		d1.display();
		System.out.println("Second distance");
		d2.display();
		
		System.out.println("Addition is");
		d3=d1.add(d2);
		d3.display();
		
		
	}
}