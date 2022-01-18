package com;

interface i1
{
	void set(int x,int y);
	
}
interface i2
{
	void disp();
}
class impclass implements i1,i2
{
	int p=10; 
	int q=20;
	@Override
	public void set (int x,int y) {
		p=x;
		q=y;
	}
	@Override
	public void disp() {
		System.out.println(p+q);
		
	}
}
public class Ex {
	public static void main(String[] args) {
		impclass obj =new impclass();
		obj.disp();
	}
}
