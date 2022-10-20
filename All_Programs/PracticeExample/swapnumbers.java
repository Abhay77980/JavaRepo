package PracticeExample;

public class swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 45, second = 15;

		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

		// Value of first is assigned to temporary
		int temporary = first;// temporary=45

		// Value of second is assigned to first
		first = second;// first=15

		// Value of temporary (which contains the initial value of first) is assigned to
		// second
		second = temporary;// second=45

		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

	}

}
