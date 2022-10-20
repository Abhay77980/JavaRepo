package abhay;

public class hello2 
{
	static int A=15;
	static float B=15.63f;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Value of static variable is= " +A);/* We can directly access the Static Variables at the starting*/
		System.out.println("Value of static variable is= " +B);
		hello2.A=52;
		System.out.println("updated value of static variable= "+hello2.A);	
				
		/*
		1) a variable declared inside the body of method or constructor or block is called local variable
		2) Local Variable can be used only inside that method/function in which it is declared
		3)Local variable can be a static variable.   */ 
		int A=52; 
		int B=69;
		int Result;
		Result=A+B;
		System.out.println("Result of Addition Of Local Variables= "+Result);
		
		/* Static variable */


		
		
		

	}

}
