package com.exception;

public class ABCD {
public void display()
{
	int a=10;
	int b=0;
	try
	{
		System.out.println(a/b);
	try
	{
		System.out.println(b/a);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
catch(Exception e)
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
	ABCD abc=new ABCD();
	abc.display();
}
	
}