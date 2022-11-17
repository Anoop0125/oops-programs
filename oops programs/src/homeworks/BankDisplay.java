package homeworks;
import java.util.Scanner;

public class BankDisplay{
public void revalid()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Correct Pin");
	int newpinn=sc.nextInt();
	this.validate(newpinn);
}
public void validate(int d)
{
	Pinn pinn=new Pinn();
	if((d==pinn.getA())||(d==pinn.getB())||(d==pinn.getC()))
	{
		System.out.println("Banking is possible");
		Scanner sc=new Scanner(System.in);
		System.out.println("Available Transactions");
		System.out.println("a.Withdrawl Amount");
		System.out.println("b.Deposite Amount");
		System.out.println("c.Total Balance Available");
		System.out.println("Select your Transaction  = ");
		String str=sc.nextLine();
		switch(str)
		{
		case "a":
		case "A":
			System.out.println("Enter the Total amount = ");
			int total=sc.nextInt();
			System.out.println("Enter the withdrawal Amount = ");
			int withdraw=sc.nextInt();
			if(total>withdraw)
			{
			total=total-withdraw;
			System.out.println("Available Balance after Withdraw = " +total);
			}
			else
			{
			System.out.println("Insufficient balance " +"  " +"Your available balance is =" +total);
			}
			break;
		case "b":
		case "B":
			System.out.println("Enter the Total amount = ");
			total=sc.nextInt();
			System.out.println("Enter the deposite Amount = ");
			int deposite=sc.nextInt();
			total=total+deposite;
			System.out.println("Available Balance after Deposite Amount = " +total);
			break;
		case "c":
		case "C":
			System.out.println("Enter the Total amount = ");
			total=sc.nextInt();
			System.out.println("Total Balance = " +total);
			break;
		default:
			System.out.println("Select correct option from above");
		}
	}
	else
	{
		System.out.println("Enter valid pin");
		this.revalid();
	}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the pin");
int pin=sc.nextInt();
BankDisplay bankdisplay=new BankDisplay();
bankdisplay.validate(pin);
}
}

