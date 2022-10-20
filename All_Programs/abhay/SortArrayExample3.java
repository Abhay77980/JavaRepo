package abhay;

public class SortArrayExample3 {
	public static void main(String[] args) {
		int i;
//initializing an array  
		int array[] = { 12, 45, 1, 8, 2 };
		System.out.print("Array elements before sorting: \n");
		for (i = 0; i < array.length; i++)
			System.out.println(array[i]);
//invoking user defined method           
		sortArray(array, array.length);
		System.out.print("Array elements after sorting: \n");
//accessing elements of the sorted array     
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

//user defined method to sort an array in ascending order  
	private static void sortArray(int array[], int n) {
		for (int i = 1; i < n; i++) { //1<5
			int j = i;//j=1
			int a = array[i];//1>0 && 
			while ((j > 0) && (array[j - 1] > a)) // returns true when both conditions are true
			{
				array[j] = array[j - 1];
				j--;
			}
			array[j] = a;
		}
	}
}
