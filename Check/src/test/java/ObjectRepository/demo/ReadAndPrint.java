package ObjectRepository.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndPrint {

	public static void main(String[] args) throws IOException {
	
		
	    Properties obj = new Properties();
	    File location= new File("C:\\Users\\sthangasamy\\eclipse-workspace\\Check\\app.properties.txt");
	    FileInputStream objfile = new FileInputStream((location));									
	        	obj.load(objfile);
	        	System.out.println((obj.getProperty("MobileTesting")));
	        	       	

	}
}
