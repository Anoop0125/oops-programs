package com.interfacee;
import java.util.Scanner;
public class HDFC implements RBI{
	
	public void deposit(int a,int b)
	{
	double d=(a*b)*intrest;
	System.out.println("Total amount = " +d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the deposite amount");
int deposite=sc.nextInt();
System.out.println("Enter the Period of time in month");
int year=sc.nextInt();
HDFC hdfc=new HDFC();
hdfc.deposit(deposite,year);

	}

}
