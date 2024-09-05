package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter interger 1: ");
		int one = in.nextInt();
		System.out.print("Enter interger 2: ");
		int two = in.nextInt();
		double twoD = two;
		double oneD = one;
		double average = (twoD + oneD)/2;
		System.out.println("Average of " + oneD + " and "+ twoD + " is " + average +".");
		
		
	}

}
