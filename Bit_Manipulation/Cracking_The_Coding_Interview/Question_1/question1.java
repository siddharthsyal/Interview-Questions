// Question 1 for bit manipulation.

import java.util.Scanner;

public class question1 {

	public static void main(String args[])
	{
  
		int n=0,m=0,i=0,j=0;
		System.out.println("Enter the value for N");
		Scanner scan1 =  new Scanner(System.in);
		n = scan1.nextInt();
  		System.out.println("Enter the value for M");
		Scanner scan2 = new Scanner(System.in);
		m = scan2.nextInt();
		System.out.println("Enter the value for J and I ");
		Scanner scan3 = new Scanner(System.in);
		j = scan3.nextInt();
		Scanner scan4 = new Scanner(System.in);
		i = scan4.nextInt();
    
    
		int allOnes =  ~0;  //initialized a 32-bit integer with all 1's
		int allOne_1 = ~0;  //initialized a 32-bit integer with all 1's
		int right = allOnes << (j+1);  // Arthimetic left shift operation to initialize some bits to 0
		int left = allOne_1 >>> (32-i);   // Logical right shift to insert 0s upto (32-i)th position starting from the MSB.
		int mask = right | left;   // OR operation to comibine left and right into a 32-bit integer.
		int n1 = n & mask ;      // AND operation to create space for M
		int new_m = m << i;      // Arthemtic left shift upto i times to get M between J & I.
		System.out.println(Integer.toBinaryString(n1 | new_m));		
	}
