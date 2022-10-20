package abhay;

 class AbhayExample2 {
	static int a = 15;
	int b = 45;

	public static int addition(int value1, int value2) {
		int value3;
		value3 = value1 + value2;
		return value3;
	}

	public static double addition(int val1, double val2) {
		double val3 = val1 * val2;
		// System.out.println("Static Method Multi="+val3);
		return val3;
	}

	public void dispaly() {
		System.out.println("Print Class Abhay Example1");

	}

}


public class AbhayExample1 {
	static int x = 78;
	int y = 99;

	public static void main(String args[]) {
		System.out.println("-----Program Starts------");
		System.out.println("static variable of class AbhayExample1=" + AbhayExample2.a);
		System.out.println("Static Method of calss AbhayExample1 Addition=" + AbhayExample2.addition(18, 56));
		System.out.println("Static Method of Class AbhayExample1 Addition=" + AbhayExample2.addition(15, 12.8));
	}
	
	}

