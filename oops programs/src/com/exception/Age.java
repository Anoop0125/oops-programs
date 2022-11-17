package com.exception;

public class Age {
	public void vote()
	{
	int a=10;

		if(a>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new ArithmeticException("Not eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age age=new Age();
		age.vote();
	}

}
