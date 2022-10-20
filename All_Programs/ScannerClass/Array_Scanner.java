package ScannerClass;

import java.util.Scanner;
public class Array_Scanner 
{
	public static void main(String[] args)
	{
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Input size Array=");
		n=scan.nextInt();//5
		int[] array=new int[10];
		
		System.out.println("Input Array=");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		
	}
	
}
