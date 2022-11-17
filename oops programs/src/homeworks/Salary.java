package homeworks;
import java.util.Scanner;
public class Salary 
{
int basicpay,deduction,bonus;
public void total()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Basic pay");
		basicpay=sc.nextInt();
		System.out.println("Enter your Deduction Amount");
		deduction=sc.nextInt();
		System.out.println("Enter your Bonus");
		bonus=sc.nextInt();
}
}
