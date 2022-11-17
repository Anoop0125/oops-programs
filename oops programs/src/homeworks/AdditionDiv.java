package homeworks;

public class AdditionDiv extends Addition {
public void div()
{
	int d=super.add();
	if(d%10==0)
	{
	System.out.println("The number is Divisible by 10");
}
	else
{
	System.out.println("The number is not Divisible by 10");
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AdditionDiv additiondiv=new AdditionDiv();
//additiondiv.add();
additiondiv.div();
	}

}
