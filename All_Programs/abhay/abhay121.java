package abhay;



public class abhay121 {
	
	static int a=32,b=65,z=a+b;
	int x,y,t;
	static int num1;
	static int num2;
	int j,k,l,res,res2;
	static int f=85,o=69,m;
	static int ss=45,rr=85;

	int q=101,s=102,v;
	static int num55;
	

	public static void main(String[] args)
	{
		//local variable
		int a=15;
		int b=89;
		int c=a+b;
		System.out.println("Addition of local variable="+c);
		
		System.out.println("value of static addition="+z);
		 //or
		System.out.println("value of static addition 2="+abhay121.z);
		//
		num55=895658;
		System.out.println("Value Directly by Static Variable="+num55);
		
		
		//Is it valid to store Static Values into the Non static Variable using Objects?????????
		// output-----------Value of object 5 is 130
		
		
		
		//static variable access
		abhay121.num1=25;
		abhay121.num2=59;
		int h=abhay121.num1+num2;
		System.out.println("VAlue of static addition="+h);
		
		
		abhay121.m=abhay121.o+abhay121.f;
		System.out.println("Value of static outside of main method="+abhay121.m);
		
		//non static variable access
		abhay121 obj1=new abhay121();
		obj1.x=52+12;
		obj1.y=86+86;
		obj1.t=562+8999;
		System.out.println("Non Static Adiition=" +obj1.x);
		System.out.println("Non Static Adiition=" +obj1.y);
		System.out.println("Non Static Adiition=" +obj1.t);
		
		abhay121 obj2=new abhay121();
		obj2.j=152;
		obj2.k=568;
		obj2.l=896;
		 
		obj2.res=obj2.j+obj2.k+obj2.l;
		System.out.println("Value of object 2="+obj2.res);
		
		
		
		/*System.out.println("value of non static variable=" +obj1.x);
		System.out.println("value of non static variable=" +obj1.y);
		System.out.println("value of non static variable=" +obj1.t);*/
		abhay121 obj3=new abhay121();
		obj3.v=obj3.q+obj3.s;
		System.out.println("Value of object 3="+obj3.v);
		
		

	}

}
