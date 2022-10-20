package abhay;
import java.util.Arrays;

public class All_In_One_Array {
	public static void main(String[] args) {
		int[] arr = { 24, 45, 25, 36, 85, 92, 79, 63 };
		System.out.println("--------------First Array-------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" " + arr[i]);
		}
		//int[] arr2 = new int[arr.length + 1];
		//System.arraycopy(arr, 0, arr2, 0, arr.length);
		//arr2[arr.length] = args;
		
		System.out.println("---------------------------");
		int[] array_02=new int[arr.length+2];
		System.arraycopy(arr,0,array_02,0,arr.length);
		System.out.println("---------------------------");
		System.out.println(array_02.length);
		System.out.println("------------Reverse Arrray---------------------");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(" " + arr[i]);
		}
		System.out.println("--------------Even Position-------------------");

		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.println("Even= " + arr[i]);
		}
		System.out.println("--------Odd Position---------");
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println("Odd= " + arr[i]);
		}
		System.out.println("-----------Maximum Array------");// 24, 45, 25, 36, 85, 92, 79, 63
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println(" Maximum in array= " + max);
		System.out.println("---------------Minimum Array--------");// 24, 45, 25, 36, 85, 92, 79, 63
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println(" Minimum in array= " + min);// 24, 45, 25, 36, 85, 92, 79, 63
		System.out.println("--------------------------");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of array=" + sum);// 24, 45, 25, 36, 85, 92, 79, 63

		int temp = 0;
		System.out.println("-----------Ascending order-------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(" " + arr[i]);
		}

		System.out.println("--------Descending order--------");

		int temp1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
			}
			System.out.println(" " + arr[i]);
		}

		System.out.println("----Even/Odd------");
		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.println("Even no is :" + num);

			} else {
				System.out.println("Odd no is :" + num);
			}
		}

		System.out.println("----Left Rotate-----");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.println();

		int temp2 = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp2;
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}
		System.out.println("----Without repetation-----");
		int[] arr2 = { 10, 15, 10, 12, 13, 12, 14 };
		int l = arr2.length;
		System.out.println("----Old Array----");
		for (int i = 0; i < l; i++)
			System.out.print(arr2[i] + " ");

		for (int i = 0; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++) {
				if (arr2[i] == arr2[j]) {
					arr2[j] = arr2[l - 1];
					l--;
				}
			}
		}
		System.out.println();
		System.out.println("new array without repeatation: ");
		for (int i = 0; i < l; i++) {
			System.out.println(arr2[i] + " ");

		}

//	int []arr3 = {2,5,7,6,12,15};
//	int max1=0,max2=0;
//	for (int i =0;i<arr.length;i++) {
//		if( arr3[i]>max1) {
//			max2=max1;
//			max1=arr3[i];
//		}
//		else if (arr3[i]>max2  &&arr3[i]!=max1) {
//			max2=arr3[i];
//			}
//		}
//			System.out.println("second largest element ="+max2);
//		}
		System.out.println("------smallest Array element----");
		int min1 = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min1) {
				min1 = arr[i];
			}
		}
		System.out.println("Smallest element is " + min1);

		int[] arr4 = { 2, 5, 7, 8, 9, 6, 12, 15 };
		int max1 = 0, max2 = 0, max3 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr4[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = arr4[i];
			} else if (arr4[i] > max3 && arr4[i] != max2) {
				max3 = arr4[i];
			}
		}

		System.out.println("third largest element =" + max3);
		System.out.println("----Addition of two matrics----");
		int[][] a = { { 10, 20 }, { 10, 20 } };
		int[][] b = { { 1, 2 }, { 1, 2 } };
		int result[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				result[i][j] = a[i][j] + b[i][j];
				System.out.print(result[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println("-------Multilpication of two matrics--------");
		int[][] a1 = { { 12, 11 }, { 12, 20 } };
		int[][] b1 = { { 21, 25 }, { 11, 21 } };
		int result1[][] = new int[2][2];
		for (int m = 0; m < 2; m++) {
			for (int j = 0; j < 2; j++) {
				result1[m][j] = a1[m][j] * b1[m][j];
				System.out.print(result1[m][j] + " ");
			}

			System.out.println();
		}
		System.out.println("-----Product of Matrics----");

		int[][] a2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int result2[][] = new int[3][3];
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < b2.length; j++) {
				result2[i][j] = a2[i][j] * b2[i][j];
				System.out.print(result2[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println("----spare Matrics-----");
		int size, row, col, count = 0;
		int[][] m4 = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		// int [][]b= {{0,2,0},{2,0,0},{0,0,1}};
		row = m4.length;
		col = m4[0].length;
		size = row * col;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (m4[i][j] == 0)
					count++;
			}
		}

		if (count > (size / 2)) {
			System.out.println("given matrix is sparse matrix");
		} else {
			System.out.println("given matrix is not sparse matrix");
		}
		System.out.println("----------Substraction--------------");
		int x[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int y[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int c[][] = new int[3][3];
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				c[i][j] = x[i][j] - y[i][j];
				System.out.print(c[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("--------------");

		int[][] array = { { 7, 4, 3 }, { 5, 8, 3 }, { 1, 6, 9 } };
		System.out.println("Given Matrics");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {

				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("lower triangular matrix is:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i >= j) {
					System.out.print(array[i][j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");

		int matrix[][] = { { 10, 20, 30 }, { 40, 50, 60 } };
		int row1 = 2, column = 3;
		int abc[][] = new int[2][3];
		System.out.println(" Given matrix is :");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(" transpose matrix is:");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row1; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------");

		int[][] array1 = { { 1, 4, 3 }, { 4, 5, 6 }, { 7, 5, 1 } };
//	int arr1[][]=new int[3][3];
		System.out.println("Given Array");

		for (int n = 0; n <= 2; n++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(array1[n][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Upper triangular matrix is:");
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 3; j++) {
				if (k <= j) {
					System.out.print(array1[k][j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
