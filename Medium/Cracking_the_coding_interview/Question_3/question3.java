//Given two straight line segments (represented as a start and end point). Compute the point of intersection, if any

import java.util.Scanner;

class point{
	public float x=0;
	public float y=0;
}

public class question3 {
	private point a1 = new point();
	private point a2 = new point();
	private point b1 = new point();
	private point b2 = new point();
	private float ma =0;
	private float mb =0;
	
	private void intersection(float ma, float mb)
	{
		if(ma==mb)//If slope is equal then lines are parallel
		{
			System.out.println("Parallel Lines");
			return;
		}
		else
		{
			float x = ((ma*this.a1.x)-(this.a1.y)-(mb*this.b1.x)+(this.b1.y))/(ma-mb);//X cooridnate of intersection
			float y = ((ma*x)-(ma*this.a1.x)+(this.a1.y));//Y coordinate for intersection
			System.out.println("Intersection at (x,y): "+x +" , "+y);
			return;			
		}
	}
	
	private void user_interface()
	{
		this.a1 = new point();//point 1 for line A
		this.a2 = new point();//point 2 for line A
		this.b1 = new point();//point 1 for line B
		this.b2 = new point();//point 2 for line B
		this.a1.x = 1;
		this.a1.y =1;
		this.a2.x = 4;
		this.a2.y = 4;
		this.b1.x = 1;
		this.b1.y =8;
		this.b2.x = 2;
		this.b2.y = 4;
		this.ma = (this.a2.y-this.a1.y)/(this.a2.x-this.a1.x);//Slope for line A
		this.mb = ((this.b2.y)-(this.b1.y))/((this.b2.x)-(this.b1.x));//Slope for line B
		intersection(ma,mb);
	}	
	public static void main(String args[])
	{
		question3 m = new question3();
		m.user_interface();
	}
}
