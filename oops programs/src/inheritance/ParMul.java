package inheritance;

public class ParMul extends GrandMul{
	public void par()
	{
		System.out.println("Parent class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParMul parmul=new ParMul();
parmul.gran();
	}

}
