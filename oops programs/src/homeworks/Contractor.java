package homeworks;
import java.util.Scanner;
public class Contractor extends Employee {

	public void calculateSalary(int a)
	{
		int salary=a*100;
		System.out.println("Total salary = " +salary);
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Contractor contractor=new Contractor();
		System.out.println("a.PartTime Employment");
		System.out.println("b.FullTime Employment");
		System.out.println("Select yor designation");
		String ch=sc.nextLine();
		switch(ch)
		{
		case "a":
			System.out.println("Enter your working hour");
			int a=sc.nextInt();
			contractor.calculateSalary(a);
			System.out.println("Thank You");
			break;
		case "b":
			final int b=8;
			contractor.calculateSalary(b);
			System.out.println("Thank you");
			break;
		default:
			System.out.println("Invalid Input");
		}
		
	}
}
