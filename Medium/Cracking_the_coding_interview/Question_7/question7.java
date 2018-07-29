//Write a method that finds max of two numbers. You should not use if-else or any comparison operator

import java.util.Scanner;

public class question7 {

	private void user_interface() {
		System.out.println("Enter the number 1");
		Scanner scan1 = new Scanner(System.in);
		int num1 = scan1.nextInt();
		System.out.println("Enter the number 2");
		Scanner scan2 = new Scanner(System.in);
		int num2 = scan2.nextInt();
		int diff = num2- num1;
		int temp = (diff >>> 31) & 0x1;//Logical right shift to check the sign bit
		int max = num2 - temp *diff;
		System.out.println(max);
	}
	public static void main(String[] args) {
		question7 m = new question7();
		m.user_interface();
	}
}
