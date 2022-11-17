package homeworks;
import java.util.Scanner;
public class FactPrint extends Fact {
	
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int facto=sc.nextInt();
		int d=super.fac(facto);
		System.out.println("The factorial of given number is " +d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FactPrint factprint=new FactPrint();
	factprint.display();
	}
}
