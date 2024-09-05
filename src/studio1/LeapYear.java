package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		String output = " is not a leap year.";
		double four = year % 4;
		double hun = year % 100; 
		double fourhun = year % 400;
		if (four == 0 && hun != 0 || fourhun == 0 )
		{
			output = " is a leap year.";
		}
		System.out.println("The year "+ year + output);

		
	}

}
