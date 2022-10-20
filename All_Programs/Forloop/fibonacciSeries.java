package Forloop;

public class fibonacciSeries {

	public static void main(String[] args) 
	{
		
		{    
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    //n3=0+2=2  3+2   3+5 5+8  8+13  13+21
		  System.out.print(" "+n3);   //n3=2,5
		  n1=n2;  //0 2 3 5  8  13   
		  n2=n3; //2  3 5 8 13 21 34
		 }    
	
		
		  

		}
	}
}


