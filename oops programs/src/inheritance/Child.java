package inheritance;

public class Child extends Parent{
public void paren()
{
	System.out.println("Child class");
}

public static void main(String[] args) {
Child child=new Child();
child.paren();
Parent parent=new Parent();//aggregation
parent.paren();
}

}
