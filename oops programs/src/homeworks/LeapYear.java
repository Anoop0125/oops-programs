package homeworks;
import java.util.Scanner;
public class LeapYear extends Leap{
public void display()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a year");
	int year1=sc.nextInt();
	super.year(year1);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LeapYear leapyear=new LeapYear();
leapyear.display();
	}

}
