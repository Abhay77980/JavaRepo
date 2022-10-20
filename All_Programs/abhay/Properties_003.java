package abhay;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.Writer;
import java.util.Properties;
//import java.util.*;

public class Properties_003
{
public static void main(String args[]) throws IOException
{
	FileInputStream fis = new FileInputStream ("D:\\abhay\\src\\abhay\\db.properties\\Abhay124.properties");
	Properties prop = new Properties();
	prop.load(fis);
	
	System.out.println("Username: "+prop.getProperty("username"));
	System.out.println("Password: "+prop.getProperty("password"));
	System.out.println("Location: "+prop.getProperty("location"));
	System.out.println("Subject: "+prop.getProperty("subject"));
	
//	prop.setProperty("subject", "Java Programming");
//	prop.setProperty("location","Aurangabad");
	
	prop.setProperty("username", "abhaypawar");
	prop.setProperty("username", "abhayPwar");
	
}
}
