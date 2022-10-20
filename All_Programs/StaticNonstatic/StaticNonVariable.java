package StaticNonstatic;

public class StaticNonVariable 
{
	

		//global variables - variable declared outside method body but present inside class body known as Global Variable
		static int age=25;//static global variable
		double salary;//non-static global variable
		
		
		
		public static void main(String[] args)
		{
			//local variable- variable declared inside method/constructor/block body known as local variable, we don;t use static keyword with local variable
			int x,y,res;
			x=10;
			y=25;
			res =x+y;
			System.out.println("Value of Local Variable="+res);
			
			StaticNonVariable obj1= new StaticNonVariable();
			obj1.salary=850.85;
			System.out.println("Value of Non="+obj1.salary);
			display();
			
			

		}
		
		public static void display()
		{
			System.out.println("Abhay Pawar");
			System.out.println("Abhay Pawar");
			System.out.println("Abhay Pawar");
			return;
		}

	}

