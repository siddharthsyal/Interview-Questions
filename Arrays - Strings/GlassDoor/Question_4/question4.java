//Write a method to check if two rectangles overlap or collide.

import java.util.Scanner;

class points{
	int x=0;
	int y=0;
}
public class question4 {

	public boolean overlap(points[] rec1 , points[] rec2)
	{
		if(rec1[1].y>rec2[0].y || rec2[0].y>rec1[1].y)
			return false;
		if(rec1[1].x<rec2[0].x||rec2[1].x>rec1[0].x)
			return false;		
		return true;
	}
	public void user_interface()
	{
		points[] rec1 = new points[2];
		points[] rec2 = new points[2];
		rec1[0] = new  points();
		rec2[0] = new  points();
		rec1[1] = new  points();
		rec2[1] = new  points();
		rec1[0].x=0;
		rec1[0].y=0;
		rec1[1].x=1;
		rec1[1].y=1;
		rec2[0].x=2;
		rec2[0].y=2;
		rec2[1].x=4;
		rec2[1].y=4;
		if(overlap(rec1,rec2))
			System.out.println("They over lap");
		else
			System.out.println("They dont overlap");
		return;		
	}
	public static void main(String[] args) {
		question4 m = new question4();
		m.user_interface();

	}

}
//HINT : I am checking for the cases that state that rectangles dont collide/overlap. 
