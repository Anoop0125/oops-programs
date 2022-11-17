package polymorphism;
import java.util.Scanner;
public class OnSeason extends OffSeason {
int total;
public void discount()
{
int d=100-40;
int dis=(d*total)/100;
System.out.println("Total Amount after OnSeason = " +dis);
}
public void display()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Amount of first purchase");
	int a=sc.nextInt();
	System.out.println("Enter the Amount of Second purchase");
	int b=sc.nextInt();
	System.out.println("Enter the Amount of Third purchase");
	int c=sc.nextInt();
	total=a+b+c;
	System.out.println("Your total amount is " +total);
	System.out.println("Select your season of Purchase");
	System.out.println("a.Off Season");
	System.out.println("b.On Season");
	String ch=sc.next();
	switch(ch)
	{

	case "a":
	super.discount(total);
	break;
	
	case "b":
	this.discount();
	break;
	default:
		System.out.println("Select Correct option");
	}
}
public static void main(String args[])
{
	OnSeason onseason=new OnSeason();
	onseason.display();
}
}
