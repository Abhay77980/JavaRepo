package abhay;

import java.util.Arrays;

public class ThirdLargest {
	public static void main(String args[]) {
		int temp, size;
		int array[] = { 10, 20, 25, 63,12 };// 10 12 20 25 63
		size = array.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				// using swapping
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Third largest number is:: " + array[size - 2]);

		int array1[] = { 10, 42, 45 };
		int size1 = array1.length;
		Arrays.sort(array1); // using sorting
		System.out.println("sorted Array ::" + Arrays.toString(array1));
		int res = array1[size1 - 2];
		System.out.println("2nd largest element is ::" + res);
	}
}
