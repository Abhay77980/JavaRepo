package abhay;

/*No return type with parameter*/
public class Fun2 
{
	public void add(int y, int z)
	{
		int x;
		x=y+z;
		System.out.println("add="+x);
	}
	public static void main (String args[])
	{
		Fun2 obj=new Fun2();
		obj.add(52,96);
	}

}
