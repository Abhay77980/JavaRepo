package abhay;

class A {
	int a, b, c;

	public static int add() {
		int a = 15, b = 45, c;
		c = a + b;
		return c;
	}

	public void dispaly() {
		System.out.println("Class A");
	}
}

class B extends A {
	public static int add() {
		int x = 78, y = 45, z;
		z = x + y;
		return z;
	}

	public void display() {
		System.out.println("Class B");
	}
}

public class AbhayExample212 {
	public static void main(String args[]) {
		B b1 = new B();
		b1.add();
		System.out.println("Non static=" + b1.a);// can access parent class variable using
		System.out.println("Non static=" + b1.b);
		System.out.println("Non static=" + b1.c);
		// b1.show();
		b1.dispaly();
	}
}
