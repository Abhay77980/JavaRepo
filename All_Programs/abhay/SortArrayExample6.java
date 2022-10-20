package abhay;

public class SortArrayExample6 {
	public static void main(String[] args) {
		int temp;
//initializing an array  
		int a[] = { 12, 5, 56, 3, 32, 2, 11, 9, 43, 94,7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Array elements in descending order:");
//accessing element of the array  
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}
}
