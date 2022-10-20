package StaticNonstatic;

public class Example14 {
	int a = 25, b = 85, result = a + b;

	static void display() {
		Example14 obj1 = new Example14();
		System.out.println("Result=" + obj1.result);

	}

	public void display2() {
		Example14 obj2 = new Example14();
		System.out.println("Result=" + obj2.result);
	}

	public static void main(String[] args) {

		Example14 obj3 = new Example14();
		System.out.println("Non static=" + obj3.result);
		obj3.a = 45;
		obj3.b = 85;
		obj3.result = obj3.a + obj3.b;
		System.out.println("Result=" + obj3.result);

		display();
		display();

	}

}
