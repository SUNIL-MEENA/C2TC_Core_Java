package com;

public class Exceptionhanding {

	public static void main(String[] args) {
		try
		{
			int a;
			a=25;
			int sum=a/0;
			System.out.println("In try block");
			int data=100/0;
		}

		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			e.getMessage();
			System.out.println("In catch block");
		}
		System.out.println("Hiiii");

	}

}
