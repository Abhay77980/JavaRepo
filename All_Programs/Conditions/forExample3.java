package Conditions;

public class forExample3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Hello"); System.out.println("Hello");
		 * System.out.println("Hello"); System.out.println("Hello");
		 * System.out.println("Hello");
		 * 
		 * for(initialization;condition;incr/decr){  
		 * //statement or code to be executed   }  
		 */

		for (int i = 0; i < 10; ++i) {
			System.out.println("Hello " + i);
		}
		System.out.println("************Print odd number between 1 to 100*************");
		for(int i=1;i<=100;i++) {
//			if(!(i%2==0)) {
//				System.out.println("Odd number is: "+i);
//			}
			if(i%2!=0) {
				System.out.println("Odd number is: "+i);
			}
		}
		System.out.println("*************************************");
		printOddNumberFromRange(1, 25);
	}
	static void printOddNumberFromRange(int start,int end) {
		int i=start;
		for(;i<=end;i++) {
			if(i%2!=0) {
				System.out.println("Odd number is: "+i);
			}
		}
	}

}
