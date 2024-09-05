package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name: ");
		String s0 = in.nextLine();
		System.out.print("Enter name: ");
		String s1 = in.nextLine();
		System.out.print("Enter name: ");
		String s2 = in.nextLine();
		System.out.print("Enter name: ");
		String s3 = in.nextLine();
		//
		System.out.println("Hi, " + s0 + ". How are you?");
		System.out.println("Hi, " + s1 + ". How are you?");
		System.out.println("Hi, " + s2 + ". How are you?");
		System.out.println("Hi, " + s3 + ". How are you?");
		//

	}
}
