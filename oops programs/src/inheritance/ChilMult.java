package inheritance;

public class ChilMult extends ParMul{
	public void chi()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChilMult childmult=new ChilMult();
childmult.gran();
childmult.par();
childmult.chi();
	}

}
