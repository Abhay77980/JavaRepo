package Java_T_Point;

class Operation {
	int square(int n) {
		return n * n;
	}
}

public class Has_A_Relationship {
	Operation op;// aggregation
	double pi = 3.14;

	double area(int radius) {
		op = new Operation();
		int rsquare = op.square(radius);// code reusability (i.e. delegates the method call).
		return pi * rsquare;
	}

	public static void main(String args[]) {
		Has_A_Relationship c = new Has_A_Relationship();
		double result = c.area(5);
		System.out.println(result);
	}
}