package StaticNonstatic;

public class MethodExample
{
	
	
	

		static void printDetails() {
			System.out.println("Hello, everyone");
			System.out.println("I am shailesh");
			System.out.println("from Pune");
			System.out.println("Working in IT");
			System.out.println("Staying in Deccan, pune");
		}
		int a=15;
		
		
		public static void main(String[] args)
		{
			System.out.println("**************1******************");
			printDetails();
			System.out.println("**************2******************");
			printDetails();
			System.out.println("**************3******************");
			printDetails();
			System.out.println("**************4******************");
			printDetails();
			System.out.println("**************5******************");
			printDetails();
			
			System.out.println("***************111111*****************");
			MethodExample.printDetails();
			
			System.out.println("****************2222*****************");
			MethodExample.printDetails();
			
			MethodExample obj1=new MethodExample();
			
			System.out.println("value of non static==="   +obj1.a);
			
		}
	}
	/**
	 * method contains set of repetitive/reusable statements
	 * method is used to reduce number of line if they are repetitive
	 */ 

