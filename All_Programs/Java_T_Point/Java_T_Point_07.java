package Java_T_Point;

class A {
	A() {
		this(5);
		System.out.println("hello a");
	}

	A(int x) {
		System.out.println(x);
	}
}

public class Java_T_Point_07 {
	public static void main(String args[]) {
		A a = new A();
	}
}
