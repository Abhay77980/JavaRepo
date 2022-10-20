package abhay;
import java.util.Scanner;
public class Even_Scanner {
 public static void main(String[] args) {
	 
 
	Scanner in=new Scanner(System.in);
	int num;
	System.out.println("Enter any Number");
	num=in.nextInt();
	if (num%2==0)
	{
		System.out.println("Given Number is Even="+num);
	}
	else
	{
		System.out.println("Given number is odd="+num);
	}
}
}
