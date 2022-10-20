package Java_T_Point;

class A1 {
	A1 getA() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}
}

public class Java_T_Point_11 {
	public static void main(String args[]) {
		new A1().getA().msg();
	}
}
