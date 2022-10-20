package StaticNonstatic;

public class Exam15
{
	public void add1() //No return type no parameter
	{
		int p,q=89,r=86;
		p=q+r;
		System.out.println("Value of Void Method add1="+p);
	}
	public int add2(int num1,int num2)//return type with parameter
	{
		int num3;
     num3=num1+num2;
		return num3;
		
	}
	public int add3(int y,int z)//return type with parameter
	{int x;
		x=y+z;  //////Local Variable
		return x;
		}
	static int q; //Static Variable
	int y;//Non Static Variable
	
	public static void display()
	{System.out.println("Display Method......+++++....VOID");
		}
	public static void main(String[] args)
	{
		int a=85,b=96,c=78;//Local Variable
		int result=a+b+c;
		System.out.println("Addition of Main Method Local Variable="+result);
		display();//access static Method
		System.out.println("Static Variable Value="+q);//it prints Default value
		Exam15.q=85;
		System.out.println("Value after update="+q);//after static variable updation
	    Exam15 obj2=new Exam15();
		System.out.println("initial Value of Non-static variable="+obj2.y);//initial value of non static variable
		obj2.y=85;
		System.out.println("Value of Non-static variable after udation="+obj2.y);//value of non static variable after updation
		Exam15 obj3=new Exam15();
		obj3.add1();
		Exam15 obj4=new Exam15();
	
		int f=obj4.add2(70,10);
		System.out.println("Value of add2="+f);
	   
	    

		Exam15 obj1=new Exam15();//we have to create object for non static method
		//int rs=obj1.add3(10,20);
		//System.out.println("Value of Add3 Method="+rs);
		System.out.println("Value of Add3 Method="+obj1.add3(85,99));
		
		
		
		
	}
	

}
