package PracticeExample;
import java.util.Scanner;
public class Largsest_01 
{
   public static void main(String args[])
   {
	   int num,num1,num2,temp;
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter First Vlaue=");
	   num=scan.nextInt();
	   System.out.println("Enter Second Number=");
	   num1=scan.nextInt();
	   System.out.println("Enter Third Number=");
	   num2=scan.nextInt();
	   // a b c
	   if (num>=num1 && num>=num2)// a>=b a>=c
	   {
		   System.out.println(num+"is largest");
		   
	   }
	   else 
		   if(num1>=num2 && num1>=num)//b>=c b>=a
		   {
			   System.out.println(num1+"is Largest");
		   }
		   else
		   {
			   System.out.println(num2+"Is Largest");
		   }
   }
}
