package StaticNonstatic;

public class NonStatic
{
	int a=89;//non static
	static int b;//static
	
	public static int substraction()
	{
		NonStatic.b=89;//static to static
		System.out.println("Static method="+NonStatic.b);
		
		NonStatic obj6=new NonStatic();//static to non- static
		obj6.a=44;
		System.out.println("Static to non Static="+obj6.a);
		int a=55;
		return a;
	}
	
	public int addition()//Non-static Method
	{
		//NonStatic obj5=new NonStatic();// static to non static (We have to create object)
		//obj5.a=50;
		//System.out.println("Non static Variable access from non static Method="+obj5.a);
		//NonStatic obj7=new NonStatic();//non static to static
		//obj7.b=85;
		//System.out.println("Access Static Variable in Non static method="+obj7.b);
		NonStatic.b=45;
		System.out.println("Value of a="+a);
		System.out.println("Access Static Variable in Non static method="+NonStatic.b);
		int x=15;
		return x;
	}

	public static void main(String[] args)
	{
		
		
		substraction();//static call method
	
		NonStatic obj2=new NonStatic();
		obj2.addition();//Non static call method
		
		
		

	}

}
