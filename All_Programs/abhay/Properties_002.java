package abhay;

import java.util.*;
import java.io.*;
import java.io.Writer;
import java.io.IOException;
import java.lang.NumberFormatException;


public class Properties_002 {
	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		
		p.setProperty("name", "Sonoo Jaiswal");
		p.setProperty("email", "sonoojaiswal@javatpoint.com");
		p.setProperty("city", "Pune");
		p.setProperty("Pincode","431121");
		
		//FileWriter p1=new FileWriter("info1.properties");
		p.store(new FileWriter("info.properties"), "Javatpoint Properties Example");
		
		System.out.println("name=" + p.getProperty("name"));
		System.out.println("email=" + p.getProperty("email"));
		System.out.println("city=" + p.getProperty("city"));
		System.out.println("pincode=" + p.getProperty("pincode"));
		
		int pin=Integer.parseInt(p.getProperty("pincode"));
		System.out.println(pin);
		
//		Integer pin=Integer.getInteger("pincode");
//		System.out.println(pin);
////		 Integer major = Integer.getInteger("pincode");
////	        //Integer minor = Integer.getInteger("app.minor.version");
////	        System.out.println("App version = " + major);
	}
}
