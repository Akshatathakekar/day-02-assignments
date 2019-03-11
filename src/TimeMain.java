import java.util.*;
class TimeMain
{
	public static void main(String args[])
	{
		Time t1=new Time();
		Time t2=new Time();
			
		t1.setTime(4,40);
		t2.setTime(2,10);
	
		System.out.println("first time is");
		t1.showTime();
		System.out.println("second time is");
		t2.showTime();
		
		System.out.println("Addition is");
		t1.addTime(t2);
		t1.showTime();
		
		
	}
}