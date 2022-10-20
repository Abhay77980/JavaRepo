package abhay;
class superc
{
	final int a=40;
	int b;
	void display()
	{
		b=60;
		System.out.println("value of a"+a);
		System.out.println("value of b="+b);
	}
	
}
final class sub extends superc//we can inherit the properties of final class but can not make subclass of final class
{
	int a=50;
	int b;
	final void display()
	{
		super.display();
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}
}


public class Final_Variable 
{
	public static void main(String args[]) {
		
		sub obj=new sub();
		obj.display();
		
	}

}
