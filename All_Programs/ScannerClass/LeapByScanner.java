package ScannerClass;

import java.util.Scanner;

public class LeapByScanner {
	public static void main(String[] args) {
		int year;
		boolean leap = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year");
		year = scan.nextInt();
		if (((year % 4 == 0) && (year % 100) != 0) || (year % 400 == 0)) 
		{
			System.out.println("Leap year=" + year);
		} else {
			System.out.println("Not Leap Year=" + year);
		}


//		if (year % 4 == 0) {
//			if (year % 100 == 0) {
//				if (year % 400 == 0)
//
//					leap = true;
//				else
//					leap = false;
//
//			} else
//				leap = true;
//		} else
//			leap = false;
//		
//		if (leap)
//			System.out.println(year+ "=is a leap year");
//		else
//			System.out.println(year+ "=is not leap year");
	}
}
