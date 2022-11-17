package com.encapsulation;

public class PrivateDisplay extends PrivateMethod1 {
public static void main(String args[])
{
	PrivateDisplay privatedisplay=new PrivateDisplay();
	privatedisplay.setA(5);
	privatedisplay.setB(10);
	privatedisplay.add();
	System.out.println("The value of a is " +privatedisplay.getA());
	System.out.println("The value of b is " +privatedisplay.getB());
	System.out.println(privatedisplay.getC());
}
}
