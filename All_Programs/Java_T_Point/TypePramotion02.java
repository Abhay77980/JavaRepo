package Java_T_Point;

class TypePramotion02 {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		TypePramotion02 obj = new TypePramotion02();
		//obj.sum(20, 20);// now ambiguity
	}
}
