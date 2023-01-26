package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Enter year");
		int year = in.nextInt();
		boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		System.out.print(isLeapYear);
		
		
		/* 1: int
		 * 2: bool
		 * 3: int
		 * 4: double
		 * 5: string
		 * 6: string
		 * 7: double
		 */
	}

}
