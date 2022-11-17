package polymorphism;

public class BHier extends AHier{
public void hier()
{
	System.out.println("B CLASS");
}
public static void main(String[] args)
{
	BHier bhier=new BHier();
	bhier.hier();
}
}
