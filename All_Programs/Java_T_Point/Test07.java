package Java_T_Point;

class Test07 {
	int data = 50;

	void change(int data) {
		
		data = data + 100;
		// changes will be in the local variable only
		System.out.println("---"+data);
	}

	public static void main(String args[]) {
		Test07 op = new Test07();
		System.out.println("before change " + op.data);
		op.change(500);
		System.out.println("after change " + op.data);
	}
}