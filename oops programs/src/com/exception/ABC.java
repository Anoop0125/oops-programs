package com.exception;

public class ABC {
public void display()
{
	int a=10;
	int b=0;
	try
	{
		System.out.println(a/b);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	finally
	{
	System.out.println(a+b);
}
}
public static void main(String args[])
{
	ABC abc=new ABC();
	abc.display();
}
	
}