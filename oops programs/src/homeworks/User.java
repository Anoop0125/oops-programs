package homeworks;
import java.util.Scanner;

public class User extends Bank {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Valid pin");
		int pinn=sc.nextInt();
		User user=new User();
		user.pin(pinn);
	}
}
