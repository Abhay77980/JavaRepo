package abhay;

public class Fun3 
{
	// return type with no parameter
	public int add()
	{
		int x,y=15,z=20;
		x=y+z;
		return x;
		
	}
	public static void main(String args[])

	{
		Fun3 obj=new Fun3();
		int rs=obj.add();
		System.out.println("add="+rs);
		
	}
}
