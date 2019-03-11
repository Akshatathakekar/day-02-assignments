import java.util.Scanner;
class RectangleMain
{
	
	public static void main(String args[])
	{

		int length;
		int breadth;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length and breadth for first rectangle"); 
		length=sc.nextInt();
		breadth=sc.nextInt();
			
		Rectangle rec1=new Rectangle(length,breadth);
		
		int area1=rec1.area();
		int perimeter1=rec1.perimeter();
		System.out.println("Area of first rectangle is  ="+area1);
		System.out.println("perimeter of first rectangle is  = "+perimeter1);

		System.out.println("Enter length and breadth for second rectangle"); 
		length=sc.nextInt();
		breadth=sc.nextInt();
		Rectangle rec2=new Rectangle(length,breadth);
		int area2=rec2.area();
		int perimeter2=rec2.perimeter();
		System.out.println("Area of second rectangle  ="+area2);
		System.out.println("perimeter of second rectangle = "+perimeter2);

		
		
		if(area1==area2)
		{
			System.out.println("Both rectangle have same area");
		}
		else
		{
			System.out.println("Both rectangle don't have same area");
		}

	}		
}