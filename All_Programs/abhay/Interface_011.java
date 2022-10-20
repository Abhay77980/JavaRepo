package abhay;

interface abhay {
	
	void display();
	int add(int z);
	
}
interface abhay22{
	
	void display2();
	int add2(int c);
}
class demo{
	
	void display() {
		 System.out.println("I am in interface 1---");
	}
	int add(int x,int y) {
		int z;
		z=x+y;
		return z;
	}
	void display2() {
		System.out.println("I am in Interface 2------");
		}
	int add2(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
}

public class Interface_011 {
public static void main(String args[]) {
	demo d1=new demo();
	d1.display();
	d1.display2();
	d1.add(15,48);
	d1.add2(48,48);
}
}
