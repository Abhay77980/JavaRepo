package abhay;
import java.util.Scanner;
public class Reverse_Scanner 
{
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		int num,rev=0,rem=0;
		System.out.println("Enter any number=");
		num=in.nextInt();
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number is="+rev);
	}
	
	

}
