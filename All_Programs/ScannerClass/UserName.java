package ScannerClass;
import java.util.*;
public class UserName
{
  public static void main(String args[])
  {
	  String UserName="Abhay@123";
	  String Input="";
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter UserName=");
	  Input=scan.next();
	  String Password="Abhay@123";
	  System.out.println("Enter Password=");
	  Password=scan.next();
	  
	  if (Input.equals(UserName)&& Password.equals(Password))
	  {
		  System.out.println("User is Valid");
	  }
	  else
	  {
		  System.out.println("User is Invalid");
	  }
	  
	  
  }
}
