package com.abstractclass;

public class Example1 extends Example{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method");
	}
	public static void main(String args[])
	{
		Example1 example1=new Example1();
		example1.sum();
		example1.display();
	}


}
