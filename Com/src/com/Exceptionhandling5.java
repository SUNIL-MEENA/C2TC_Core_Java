package com;

public class Exceptionhandling5 {
	public static void main(String[] args) {
	 try
		{
				int x=10;
			try 
			{
				int y=12;
				System.out.println(+x);System.out.println(+y);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
			finally
			{
				System.out.println("finally block");
				try
				{
					int y=10/2;
					System.out.println(+y);
				}
				catch(Exception e)
				{
					try
					{
						int z=30/30;
	System.out.println(+z);
					}
					finally
					{
						System.out.println("In finally under catch");
					}
					System.out.println(e);
				}
			}
}

}
