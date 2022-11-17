package homeworks;
import java.util.Scanner;
public class StudAdd {
	String address;
public void address()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your address");
	address=sc.nextLine();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student=new Student();
student.stud();
StudAdd studadd=new StudAdd();
studadd.address();
System.out.println("Name = " +student.name);
System.out.println("Roll Number = " +student.roll);
System.out.println("Address = " +studadd.address);
	}

}
