package Java_T_Point;

//Java Program to illustrate the use of static variable which  
//is shared with all objects.  
public class Java_T_Point_05 {
	static int count = 0;// will get memory only once and retain its value

	Java_T_Point_05() {
		count++;// incrementing the value of static variable
		System.out.println(count);
	}

	public static void main(String args[]) {
//creating objects  
		Java_T_Point_05 c1 = new Java_T_Point_05();
		Java_T_Point_05 c2 = new Java_T_Point_05();
		Java_T_Point_05 c3 = new Java_T_Point_05();
	}
}
