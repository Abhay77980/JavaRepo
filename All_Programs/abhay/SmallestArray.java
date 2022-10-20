package abhay;

public class SmallestArray {
	public static int getSecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   //0[1]<6
		        {  
		            for (int j = i + 1; j < total; j++) // 1[2]<[2]6
		            {  
		                if (a[i] > a[j])   //1>2
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[0];//  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("First smallest: "+getSecondSmallest(a,6));  
		System.out.println("First smallest: "+getSecondSmallest(b,7));  
		}}  


