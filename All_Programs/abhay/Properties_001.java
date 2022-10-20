package abhay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;
import java.util.*;
public class Properties_001 {

	public static void main(String[] args) throws IOException{
		/*
		 * 1. First find the location where you have stored property file
		   2. Create an instance of FileInputStream class and pass the property file location to its constructor.
		   3. Create an instance of Properties class
		   4. With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
   		   5. Call getProperty(key) of Properties class to read data from property file
		 */
		/*Property file location with 
		 * absolute path: F:\JavaWorkspace\CoreJavaSessions\PropertyFiles\TestData.properties
		 * relative path: .\PropertyFiles\TestData.properties
		 * Using System class:
		 * 			String currentDir=System.getProperty("user.dir");
		 * 			String propertyFileLocation =currentDir+"\\PropertyFiles\\TestData.properties";
		 */
		//Absolute path --> F:\JavaWorkspace\CoreJavaSessions\AppData\SignupDetails.properties
		String filePath = System.getProperty("user.dir") + "D:\\All_Programs\\abhay\\db.properties\\db.properties";
		System.out.println("Current Dir: " + filePath);
		String filePath1="D:\\All_Programs\\abhay\\db.properties\\db.properties";
		// file location and filename
		// Absolute path
		FileInputStream fis = new FileInputStream("D:\\All_Programs\\abhay\\db.properties\\db.properties");
		// or
		FileInputStream fis1 = new FileInputStream(filePath1);
		// or relative path
		//FileInputStream fis2 = new FileInputStream(".\\AppData\\SignupDetails.properties");

		// Create an instance of Properties class
		Properties prop = new Properties();

		// load property file using load() of properties class
		prop.load(fis1);
		//prop.load(fis);
		
		//read data from property file using getProperty(string key)
		System.out.println("Username: "+prop.getProperty("username"));
		System.out.println("Password: "+prop.getProperty("password"));
		System.out.println("City: "+prop.getProperty("city"));
		System.out.println("Subject: "+prop.getProperty("subject"));
		System.out.println("Interesst"+prop.getProperty("Interest"));
					//or
		String username=prop.getProperty("username");
		System.out.println("username---"+username);
		
//		int amount=Integer.parseInt(amount);
//		int res=amount/10;
//		System.out.println("Result: "+res);
		
		int Amount=Integer.parseInt(prop.getProperty("amount"));
		System.out.println(Amount);
		
		int ints=Integer.parseInt(prop.getProperty("interest"));
		System.out.println("Interest="+ints);
		
//		Integer pin=Integer.getInteger("interest");
//		System.out.println(pin);
		prop.setProperty("subject", "Java");
		prop.setProperty("city", "Aurangabad");
		
		System.out.println("City: "+prop.getProperty("city"));
		System.out.println("Subject: "+prop.getProperty("subject"));
		
		Set set=prop.entrySet();
		
		Iterator itr=set.iterator();  
		while(itr.hasNext())
		{  
		Map.Entry entry=(Map.Entry)itr.next();  
		System.out.println(entry.getKey()+" = "+entry.getValue());  
		
		
		}
		
		
	
		

	}

}
