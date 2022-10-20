package Java_T_Point;

public class Java_T_Point_03 {

	public static void main(String args[]) {
		// For positive number, >> and >>> works same
		System.out.println(20 >> 2);
		System.out.println(20 >>> 2);
		// For negative number, >>> changes parity bit (MSB) to 0
		System.out.println(-20 >> 2);
		System.out.println(-20 >>> 2);
		\u000d System.out.println("------------------------------------");
		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(20 >> 2);// 20/2^2=20/4=5
		System.out.println(20 >> 3);// 20/2^3=20/8=2
		System.out.println("------------------------------------");
		System.out.println(10 << 2);// 10*2^2=10*4=40
		System.out.println(10 << 3);// 10*2^3=10*8=80
		System.out.println(20 << 2);// 20*2^2=20*4=80
		System.out.println(15 << 4);// 15*2^4=15*16=240
		System.out.println("------------------------------------");
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b && a++ < c);// false && true = false
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a < b & a++ < c);// false && true = false
		System.out.println(a);// 11 because second condition is checked
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		int a1 = 10;
		int b1 = 5;
		int c1 = 20;
		System.out.println(a1 > b1 || a1 < c1);// true || true = true
		System.out.println(a1 > b1 | a1 < c1);// true | true = true
		// || vs |
		System.out.println(a1 > b1 || a1++ < c1);// true || true = true
		System.out.println(a1);// 10 because second condition is not checked
		System.out.println(a1 > b1 | a1++ < c1);// true | true = true
		System.out.println(a1);// 11 because second condition is checked
		System.out.println("------------------------------------");

		int ab = 10;
		int bc = 5;
		int min = (ab < bc) ? ab : bc;
		System.out.println(min);
		System.out.println("------------------------------------");
		int x = 10;
		int y = 20;
		x += 4;// a=a+4 (a=10+4)
		y -= 4;// b=b-4 (b=20-4)
		System.out.println(x);
		System.out.println(y);
		System.out.println("------------------------------------");
		int p = 10;
		p += 3;// 10+3
		System.out.println(p);
		p -= 4;// 13-4
		System.out.println(p);
		p *= 2;// 9*2
		System.out.println(p);
		p /= 2;// 18/2
		System.out.println(p);
		
		String address = "Delhi, India";    
		if(address.endsWith("India")) {    
		if(address.contains("Meerut")) {    
			System.out.println("Your city is Meerut");    
			}else if(address.contains("Noida")) {    
			System.out.println("Your city is Noida");    
			}else {    
			System.out.println(address.split(",")[0]);    
			}    
			}else {    
			System.out.println("You are not living in India");    
			}
			String[] names = {"Java","C","C++","Python","JavaScript"};    
			System.out.println("Printing the content of the array names:\n");    
			for(String name:names) {    
			System.out.println(name);  
			}
				a:    
				for(int i = 0; i<= 10; i++) 
				{    
				b:    
					
				for(int j = 0; j<=15;j++)
				{    
				c:    
				for (int k = 0; k<=20; k++)
				{    
				System.out.println(k);    
				if(k==5) 
				{    
					break a;    }
				}
			
				}
				}
			}
	}

