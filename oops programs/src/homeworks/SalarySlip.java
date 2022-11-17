package homeworks;

public class SalarySlip extends HraPf{
	int totalslip;
public void slip()
{
totalslip=basicpay+bonus+(hra-pf-deduction);
System.out.println("SALARY SLIP");
System.out.println("Basic Pay = " +basicpay);
System.out.println("Deduction = " +deduction);
System.out.println("HRA = " +hra);
System.out.println("PF = " +pf);
System.out.println("Bonus = " +bonus);
System.out.println("Total Salary in Hand = " +totalslip);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
SalarySlip salaryslip=new SalarySlip();
salaryslip.total();
salaryslip.deduct();
salaryslip.slip();

	}

}
