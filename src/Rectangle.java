class Rectangle
{

	int length;
	int breadth;
	
	
	Rectangle(int length,int breadth)
	{
		length=length;
		breadth=breadth;
	}
	
	int area()		
	{
		return (length*breadth);
	}
	
	int perimeter()		
	{
		return 2*(length+breadth);
	}
}