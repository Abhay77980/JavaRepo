package ScannerClass;

import java.util.Scanner;

public class Prime_Scanner {
	public static void main(String[] args) {
		int num, count = 0;
		System.out.println("Input Number");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		for (int i = 1; i <= num; i++) { //1<=6 2<=6 3<=6 4<=6 5<=6 6<=6
			if (num % i == 0) {//1%6=0 true count+1,6%2 true count+1,6%3 true count+1,6%4 f,6%5 f,6%6 true count+1
				count++;
			}
		}
		if (count == 2) {//count==2
			System.out.println("Given Number is Prime=" + num);
		} else {
			System.out.println("Given Number is Not Prime=" + num);
		}

	}
}
