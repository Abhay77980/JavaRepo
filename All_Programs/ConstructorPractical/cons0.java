package ConstructorPractical;



	public class cons0
	{
		int age=25;//non static variable 
		
		
		void display() 
		{
			System.out.println("Hi, I am display method");
		}
		public static void main(String[] args) {
			
			cons0 c1=new cons0();//calling default constructor of the current class written by java compiler
			System.out.println(c1.age);
			c1.display();
		}
	}
	/*
	In every class where we have created object there was a constructor.

	constructor:
		1. its similar to method
		2. bu
	3. but it will not have any return type and its won't return any value to JVM
		4. we can't call/execute constructor based our requirement, it will be called/executed whenever class object/instance is created
		
	constructor is used to initialize non static members of the class
		type:
			1. default constructor -- when a class doesn't have any type of constructor dn java compiler write a constructor which known as default constructor
								   -- default constructor doesn't have any parameter and its
	esz-wwqn-ent*/

