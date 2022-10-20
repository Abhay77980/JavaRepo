package abhay;
class abc
{
	final int c=48;
	int a=44;
	static int b=56;
	
	void display()// Regular Method
	{
		int a=45;
		System.out.println("Value of Local Variable a="+a);
		this.a=78;
		System.out.println("Value of This Variable a="+this.a);//this keyword
		System.out.println("Show Display Method 1");
		System.out.println("Vlaue of Final Variable="+this.c);
	}
	
	public static void show () //static Method
	{
		 System.out.println("Show Static method 1");
		 
	}
	}
class def extends abc
{
	void display()
	{
		System.out.println("Show Display Method 2");
		super.display();//shows parent class display method
		//this.display();//this statement
	}
	public static void show()
	{
		 System.out.println("Show Static method 2");
		 
	}
	}
class xyz
{
	int x;
	int y;
	int c;
	xyz(int a,int b)
	{
		 c=a+b;
		System.out.println("Constructor Addition="+c);
		
	}
	xyz()
	{
		x=15;y=45;int t=x+y;
		System.out.println("Default Construtor="+t);
	}
	void show()
	{
		System.out.println("Parameterized Constructor="+c);
		
	}
	
	
}

public class PracticeProgram1
{
public static void main(String [] args)
{
	System.out.println("--------------Main Method Local Variables--------------------------");
	int a=45;
	char G='b';
	System.out.println(G);
	System.out.println("Main Method Local Variables="+a);
	System.out.println("--------------Instance or object of Current Class--------------------------");
	def d1=new def();
	System.out.println("------------------------------------------------------");
	d1.display();
	System.out.println("------------------------------------------------------");
	//d1.show();// for class def-------- but this is not standard format
	def.show();//this is standard format
	System.out.println("------------------------------------------------------");
	
	abc a1=new abc();
	//a1.show();//for class def-------- but this is not standard format
	abc.show();//this is standard format
	System.out.println("-----------------Static -Non static Variable-------------------------------");
	//a1.a=45;//to access non static variable
	System.out.println("Value of non static variable="+a1.a);//print the value of non static variable a
	System.out.println("Value of static Variable="+abc.b);
	System.out.println("----------------------Inheritance-----------------------------");
	d1.display();
	//d1.show();
	System.out.println("---------------Constructor Call--------------");
	
	xyz n1=new xyz();
	xyz n2=new xyz(15,20);
	xyz n3=n2;//Copy Constructor
	n3.show();
	
	


	
	
	

}
}
