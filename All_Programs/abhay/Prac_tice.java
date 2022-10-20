package abhay;

public class Prac_tice {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 15;
		arr[1] = 45;
		arr[2] = 12;
		arr[3] = 25;
		arr[4] = 49;
		System.out.println("Print array=" + arr.length);
		//System.out.println("------" + arr);
		//int arr1[] = arr.clone();
		//System.out.println("---------" + arr1);
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println("  "+arr[i]);
		}
		
		for(int i:arr)
		{
			System.out.println("----"+i);
		}
 	}
}
