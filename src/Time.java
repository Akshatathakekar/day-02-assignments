import java.util.*;
class Time
{
	int hours;
	int minutes;
	
	public void setTime(int minutes,int hours)
	{
		this.hours=hours;
		this.minutes=minutes;
	}	
	
	void showTime()
	{
		System.out.println(this.hours);
		System.out.println(this.minutes);
			
	}

	public Time addTime(Time t)
	{
		minutes=this.minutes+t.minutes;
		hours=this.hours+t.hours;
		t.minutes=minutes;
		t.hours=hours;
		return t;
			
	}
}