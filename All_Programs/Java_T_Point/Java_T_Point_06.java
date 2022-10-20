package Java_T_Point;

//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
public class Java_T_Point_06 {
	int count = 0;// will get memory each time when the instance is created

	Java_T_Point_06() {
		count++;// incrementing value
		System.out.println(count);
	}

	public static void main(String args[]) {
//Creating objects  
		Java_T_Point_06 c1 = new Java_T_Point_06();
		Java_T_Point_06 c2 = new Java_T_Point_06();
		Java_T_Point_06 c3 = new Java_T_Point_06();
	}
}
