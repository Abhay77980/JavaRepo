package Java_T_Point;

interface Printable {
	void print();
}

interface Showable extends Printable {
	void show();
}

class ss implements Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		ss obj = new ss();
		obj.print();
		obj.show();
	}
}
