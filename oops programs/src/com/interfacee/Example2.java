package com.interfacee;

public class Example2 implements Example {
	
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub()
	{
		int a=20;
		int b=5;
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example2 example2=new Example2();
example2.sum();
example2.sub();
	}

}
