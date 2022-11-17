package homeworks;

public class HraPf extends Salary {
	int hra,pf;
	public void deduct()
	{
		int s=100-5;
		hra=(s*basicpay)/100;
		int t=100-20;
		pf=(t*basicpay)/100;
	}

}
