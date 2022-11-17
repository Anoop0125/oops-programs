package accessmodifier;

public class SamplePublic {
public int a=20;
private int b=30;
protected int c=40;
int d=10;
public void inst()
{
	System.out.println("Public Variable " +a);
	System.out.println("Private Variable " +b);
	System.out.println("Protected Variable " +c);
	System.out.println("Default Variable " +d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//SamplePublic samplepublic=new SamplePublic();
	}

}
