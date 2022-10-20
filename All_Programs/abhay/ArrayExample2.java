package abhay;

public class ArrayExample2 {
	public static void main(String[] args) {

		int[] m = new int[] { 1, 5, 2, 6, 4, 8, 6, 2, 5, 1 };
		System.out.println("For Duplicate Element");///to find out duplicate element in the array
		System.out.println("----------------------------------------");

		for (int i = 0; i < m.length; i++)//i=0 i=2 
		{
			for (int j = i + 1; j < m.length; j++) //2<10
			{
				if (m[i] == m[j]) // 0[1]==1[5] 0[1]==2[2] 0[1]==3[6]
				{
					System.out.println(" " + m[j]);//1[5] 2[2] 3[6]
				}
			}
		}
		
	}

}
