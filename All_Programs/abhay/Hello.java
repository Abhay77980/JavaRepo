package abhay;

public class Hello 
{
static int a=15;
int age=52+62;
double roi=10.12;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=15,b=52;
		double c=25,d=52;
		int add=a+b;
		double add2=c+d;
		System.out.println("hello word");
		System.out.println("value of static integer is " +a);
		
		Hello value=new Hello();
		System.out.println("Value of instance is " +value.age);
		System.out.println("Value of instance is " +value.roi);
		System.out.println("Addition of class variable=" +add);
		System.out.println("Addition of class variable=" +add2);
	}

}
