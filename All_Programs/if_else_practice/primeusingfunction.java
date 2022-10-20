package if_else_practice;

public class primeusingfunction {
	static void prime(int no)
	{
		int count=0;
		for(int i=1;i<=no;i++) //i=1<3 i=2<3 i=3<=3      // i=1<7 i=2<7 i=3<7 i=4<7 i=5<7 i=6<7 i=7<=7
		{													
			if(no%i==0) // 3/1=0-- 3/2=1--- 3/3=0			//// 7/1=0t  7/2f 7/3f 7/4f 7/5f 7/6f 7/7t
				count++;//1 2
		}
		if(count==2)
		{
			System.out.println(no+ " =is prime");
			
		}
		else
		{
			System.out.println(no+" = is Not prime");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		prime(7);
		

	}

}
