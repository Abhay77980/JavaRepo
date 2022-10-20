package Java_T_Point;

class Student121
{
	int rollno;
	String name, course;
	float fee;

	Student121(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student121(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

public class Java_T_Point_08 {
	public static void main(String args[]) {
		Student121 s1 = new Student121(111, "ankit", "java");
		Student121 s2 = new Student121(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}
