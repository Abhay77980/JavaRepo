package Java_T_Point;

interface Printable01 {
	void print();
}

interface Showable01 {
	void display();
}

abstract class abhay  implements Showable01
{
	public void display()
	{
		System.out.println("--------");
	}
	void show() {
		System.out.println("I am abstract 2");
	}

	abhay() {
		System.out.println("I am Abstarct");
	}
}

class Interface_01 extends abhay implements Printable01, Showable01 {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Interface_01 obj = new Interface_01();
		obj.print();
		obj.show();
		obj.display();
	}
}
