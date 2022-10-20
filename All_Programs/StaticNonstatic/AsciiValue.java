package StaticNonstatic;

public class AsciiValue {

	public static void main(String[] args) 
	{
		
			char c1='B',c2='c';
			System.out.println(c1);
			System.out.println(c2);
			int c3=c1+c2;//66+99
			System.out.println("ASCII---"  +c3);
			int b='B';
			System.out.println(b);
			int c='c';
			System.out.println(c);
			char n='a';
			char m='z';
			
//			for (int i='a';i<='z';i++)
//			{
//				
//				System.out.println(n+"="+i );
//			}
//			 char j='c';
//			 for (j='a';j<='z';j++)
//			 {
//				 System.out.println(c+ " ");
//			 }
//			  
//			for (char j='a';j<='z';j++)
//			{
//				System.out.print(j+ "");
//			}
			
//			char ch='a';
//			int ascii=ch;
//			System.out.println(ch +"="+ascii );
//			
//			for(int i=65;i<=90;i++)
//			{
//				System.out.println("the ascii of"+(char)i+"="+i);
//			}
			char ch;
			for(ch='a';ch<='z';ch++) 
			{
				
				for(int i=ch;i<=ch;i++) 
				{
					System.out.println(" "+ch+" "+i);
				}
		}

	}
}

