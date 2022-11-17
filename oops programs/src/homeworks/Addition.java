package homeworks;
import java.util.Scanner;
public class Addition {
 public int add()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the first number = ");
	 int a=sc.nextInt();
	 System.out.println("Enter the second number = ");
	 int b=sc.nextInt();
	 int c=a+b;
	 System.out.println("The addition of two number is " +c);
	 return(c);
 }

}
