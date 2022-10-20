package Java_T_Point;

class Test08 {
	int data = 50;

	void change(Test08 op) {
		op.data = op.data + 100;// changes will be in the instance variable
	}

	public static void main(String args[]) {
		Test08 op = new Test08();
		System.out.println("before change " + op.data);
		op.change(op);// passing object
		System.out.println("after change " + op.data);
	}
}
