package ObjectRepository.demo;		

import java.io.File;
import java.io.FileInputStream;		
import java.io.FileNotFoundException;		
import java.io.IOException;		
import java.util.Properties;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;		

public class ObjectRepo {				

public static void main(String[] args) throws IOException {										
	
// Create WebDriver Instance		
    
	WebDriver driver;			
    String exePath = "C:\\Users\\sthangasamy\\Desktop\\Padi\\ChromeDriver\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", exePath);
	 driver = new ChromeDriver(); 			
	 
// Load the properties File		
    Properties obj = new Properties();					
    File location= new File("C:\\Users\\sthangasamy\\eclipse-workspace\\Check\\src\\test\\java\\ObjectRepository\\demo\\Objrepo.properties");
    FileInputStream objfile = new FileInputStream((location));																	
    obj.load(objfile);
    
    					
// Navigate to given URL		
    	driver.get((obj.getProperty("url1")));
    	String element;    	
    	element= driver.findElement(By.xpath(obj.getProperty("sampletext"))).getText();
    	System.out.println(element);
    	driver.manage().window().maximize();	
    															
  }		

}		