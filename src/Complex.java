import java.util.*;
class Complex
{
	double real;
	double imaginary;
	
	public void setValue(double real,double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}	
	
	void display()
	{
		System.out.println(this.real +"+i"+this.imaginary);
		
	}


	public Complex sum(Complex c)
	{
		Complex c3 = new Complex();
		c3.real=this.real+c.real;
		c3.imaginary=this.imaginary+c.imaginary;
		return c3;	
	}

	
	
}