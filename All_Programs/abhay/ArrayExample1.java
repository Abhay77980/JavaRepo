package abhay;

import java.util.Arrays;

public class ArrayExample1 {
	public static void main(String[] args) {

		int[] A = { 48, 45, 78, 98 };

//		System.out.println(" " + A[0]);
//		System.out.println(" " + A[1]);
//		System.out.println(" " + A[2]);
//		System.out.println(" " + A[3]);
		//copy array to new variable
		int[] b = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			b[i] = A[i];
			// b[0]++;
		}
		System.out.println("--------------Copy Array-----------------------");
		for (int i = 0; i < b.length; i++) {
			System.out.println(" Array of B= " + b[i]);
		}
		System.out.println("-------------------------------------------");
		System.out.println("Array Lenght=" + A.length);
		// System.out.println("Array Clone="+array.clone());
		System.out.println("---------------------------------------------");

		for (int i = 0; i < A.length; i++) {
			System.out.println("Array of A= " + A[i]);
		}
		System.out.println("-----------Using Tostring-----------");
		System.out.println("Array of A=" + Arrays.toString(A));

		System.out.println("----using clone Method------");

		int[] s = { 45, 78, 96, 88 };

		int[] t = s.clone();

		for (int i = 0; i < s.length; i++) {
			System.out.println("S array=" + s[i]);
		}
		System.out.println("-------------------------------------");
		for (int i = 0; i < t.length; i++) {
			System.out.println("T array=" + t[i]);
		}

	}

}
