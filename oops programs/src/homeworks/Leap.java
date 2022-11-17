package homeworks;

public class Leap {
public void year(int year1)
{
	if((year1%4==0)&&(year1%400==0)||(year1%100!=0))
	{
		System.out.println("Leapyear");
	}
	else
	{
		System.out.println("Not a leap year");
	}
}
}
