package if_else_practice;

public class symbolorcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='m';
		if (ch>=65 && ch<=90)
		{
			System.out.println("Character is Upper letter=" +ch);
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("Character is lower case="+ch);
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("Character is Digit="+ch);
		}
		else
		{
			System.out.println("Character is symbol="+ch);
		}
	}

}
