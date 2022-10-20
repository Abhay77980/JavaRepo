package abhay;

class Cons0 {
	int a;

	Cons0() {
		a = 78;
		System.out.println("Vlaue of class Cons0= " + a);
	}

}

class Cons1 {
	Cons1(int a, int b) {
		int c = a + b;
	}

	public static double addition(double x, double y) {
		double z = x + y;
		return z;

	}

}

public class AbhayExample111 {

	AbhayExample111() {
		System.out.println("Default Constructor");
	}

	void display() {
		System.out.println("I am Display Method of class Example111");
	}

	public static void main(String args[]) {
		Cons0 c1=new Cons0();
		System.out.println("Value of A="+c1.a);
		Cons1 c2=new Cons1(12,15);
		c2.addition(12.2,45.5);
		AbhayExample111 a1=new AbhayExample111();
		a1.display();
		
	}
}
