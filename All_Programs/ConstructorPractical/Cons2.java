package ConstructorPractical;


	public class Cons2 
	{

		int age;
		double salary;
		/**
		 *  below is default constructor, that will be written by java compiler at compile time
		  Cons2(){
				//empty body
			}
		*/
		public static void main(String[] args) {

			int age=15;
			Cons2 c1 = new Cons2();
			System.out.println(c1.age);// 0
			System.out.println(c1.salary);// 0.0
			c1.age=14;
			c1.salary=21.0;
			
			System.out.println("age="+c1.age);// 14
			System.out.println("salary="+c1.salary);// 21.0
			System.out.println("Age="+age);// 21.0
			
			
			
			
			
			
		}
	}


