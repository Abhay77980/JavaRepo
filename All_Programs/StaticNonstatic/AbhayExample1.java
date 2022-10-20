package StaticNonstatic;





public class AbhayExample1 {
	static int a=15;
	int b = 45;
	
	public static int addition(int value1,int value2)
	{
		int value3;
		value3=value1+value2;
		return value3;
	}
	public void dispaly()
	{
		System.out.println("Print Class Abhay Example1");
		
	}
	
}

class AbhayExample2 
{
	static int x=78;
	int y=99;
public static void main(String args[])
{
	System.out.println("-----Program Starts------");
	System.out.println("static variable of class AbhayExample1="+AbhayExample1.a);
	System.out.println("Static Method of calss AbhayExample1="+AbhayExample1.addition(18,56));
	
	//object creation for class variable,non-static variable and method
	AbhayExample1 A=new AbhayExample1();
	System.out.println("Class Variable of AbhayExample1="+A.b);
	A.dispaly();
}
}


