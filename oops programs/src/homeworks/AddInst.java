package homeworks;

public class AddInst {
	int a,b;
	AddInst(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void add()
	{
		int c=a+b;
		System.out.println("Addition of two number is " +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AddInst addinst=new AddInst(12,5);
addinst.add();
	}

}
