package Java_T_Point;

public class Java_T_Point_09{  
	  void m(Java_T_Point_09 obj){  
	  System.out.println("method is invoked");  
	  }  
	  void p(){  
	  m(this);  
	  }  
	  public static void main(String args[]){  
	  Java_T_Point_09 s1 = new Java_T_Point_09();  
	  s1.p(); }}  

