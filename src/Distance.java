import java.util.*;
class Distance
{
	int feet;
	float inches;
	
	public void setValue(int feet,float inches)
	{
		this.feet=feet;
		this.inches=inches;
	}	
	
	void display()
	{
		System.out.println(this.feet);
		System.out.println(this.inches);
			
	}


	public Distance add(Distance d)
	{
		Distance d3=new Distance();
		d3.feet=this.feet+d.feet;
		d3.inches=this.inches+d.inches;
		return d3;

	
	}
}