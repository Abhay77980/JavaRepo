package if_else_practice;

public class primeNumberExample {
	static void checkPrimeNumberTillPassedNumber(int num) {
		if (!(num == 0 || num == 1)) //11==0  | 11==1 
		{
			for (int i = 2; i <= num; i++)
			{   //2<=11
				int counter = 0;
				for (int j = i; j >= 1; j--) //2>=1 2--
				{
					if (i % j == 0)// 7/7 
					{
						++counter;
					}
				}
				if (counter == 2)
				{
					System.out.println("Prime Number: " + i);
				}
			}
		}else {
			System.out.println("Either the given number is 0/1, so won't it consider for prime number");
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		checkPrimeNumberTillPassedNumber(11);

	}

}
