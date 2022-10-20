package StaticNonstatic;

class a {

	public static void display() {
		System.out.println("I am Static 1");
	}

}

class b extends a {

	public static void display() {
		System.out.println("I am Static 2");
	
	}
}

public class Static_Method_Overloading {

	public static void main(String args[]) {
		b b1 = new b();
		b1.display();

	}

}
