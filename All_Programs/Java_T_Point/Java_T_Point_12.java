package Java_T_Point;
// hierarchical Inheritance

class Animal 
{
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("meowing...");
	}
}

public class Java_T_Point_12 {
	public static void main(String args[]) {
		Cat c = new Cat();
		c.meow();//can access cat class and parent class
		c.eat();
		
		Dog d=new Dog();
		d.bark();//can access dog class and parent class but not can
		d.eat();
//c.bark();//C.T.Error }}
	}
}
