package abhay;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Fun {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1. First find the location where you have stored property file
		   2. Create an instance of FileInputStream class and pass the property file location to its constructor.
		   3. Create an instance of Properties class
		   4. With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
   		   5. Call get(key) of Properties class to read data from property file
		 */
		/*Property file location with 
		 * absolute path: F:\JavaWorkspace\CoreJavaSessions\PropertyFiles\TestData.properties
		 * relative path: .\PropertyFiles\TestData.properties
		 * Using System class:
		 * 			String currentDir=System.getProperty("user.dir");
		 * 			String propertyFileLocation =currentDir+"\\PropertyFiles\\TestData.properties";
		 */
		FileInputStream fis = new FileInputStream("D:\\abhay\\src\\abhay\\db.properties");
	
		Properties prop=new Properties();	
		
		prop.load(fis);
		
		String pAmount=prop.getProperty("username");
		System.out.println(pAmount);
		int amount=Integer.parseInt(pAmount);
		//int res=amount/10;
		int roi=Integer.parseInt(prop.getProperty("username"));
//		System.out.println("Result: "+res);
//		System.out.println("ROI: "+roi);
		//to wrote content into the file use setProperty()
		prop.setProperty("Subject3", "Java");
		prop.setProperty("Subject4", "Selenium");
		//location where you want to save your file using FileOutputStream
		FileOutputStream fos= new FileOutputStream("D:\\\\abhay\\\\src\\\\abhay\\\\db.properties");
		//saving the file into required location using store()
//		prop.store(fos, "Added two new keys");
//		//close the connection
//		fos.close();	
		System.out.println("Property file updated successfully....");
	}
}



