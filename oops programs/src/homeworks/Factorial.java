package homeworks;

public class Factorial {
	int fact;
public void show(int a)
{
	fact=1;
	for(int i=1;i<=a;i++)
	{
	fact=fact*i;
	}
	dis();
}
public void dis()
{
	System.out.println("Factorial of given number is = " +fact);
}
	public static void main(String[] args) {
Factorial factorial=new Factorial();
factorial.show(5);
	}

}
