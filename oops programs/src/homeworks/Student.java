package homeworks;
import java.util.Scanner;
public class Student {
String name;
int roll;
public void stud()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a name");
	name=sc.nextLine();
	System.out.println("Enter RollNo");
	roll=sc.nextInt();
}
}
