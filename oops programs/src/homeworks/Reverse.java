package homeworks;
import java.util.Scanner;
public class Reverse {
int n;

Reverse()
{
	System.out.println("Finding the reverse");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
}
Reverse(int a)

{
	this();
	System.out.println(n);
	a=this.n;
	//this.n=n;
	int rem;
	int rev=0;	
while(n>0)
{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	
}

	System.out.println("Reverse of given number is " +rev);
}
public static void main(String[] args) {
	
	Reverse reverse=new Reverse();
	}

}