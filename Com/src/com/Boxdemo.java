package com;

class Box
{
		float width;
		float height;
		float depth;
		
		float calcVol()
		{
			return width*height*depth;
		}
	
}
public class Boxdemo {
		  public static void main(String[] args) {
			  Box box1;
			  box1=new Box();
			  box1.width=3.4f;
			  box1.height=2.2f;
			  box1.depth=1.4f;
			  float vol=box1.calcVol();
			  System.out.println("volume of box1 is"+vol);
			
			  Box box2=new Box();
			  //Box box2;
			  box2=new Box();
			  box2.width=3.4f;
			  box2.height=2.6f;
			  box2.depth=1.7f;
			  float vol2=box2.calcVol();
			  System.out.println("volume of box1 is"+vol2);
		
	}

}
