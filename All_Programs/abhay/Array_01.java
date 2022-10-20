package abhay;

import java.util.Scanner;
import java.util.Arrays;

public class Array_01 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int ar[]= {45,52,85,89,74,15};
		int newar[]=new int[7];
		int index;
		int value;
		System.out.println("Enter Index");
		index=in.nextInt();
		System.out.println("Enter Value");
		value=in.nextInt();
		System.out.println("Before Insertion="+Arrays.toString(ar));
		for (int i=0,j=0;i<newar.length;i++)
		{
			if (index!=i)
			{
				newar[i]=ar[j];
				j++;
			}
			else
			{
				newar[i]=value;
			}
			
		}
		System.out.println("After Insertion"+Arrays.toString(newar));
		
	}
}
