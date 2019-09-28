package FirstTry.Check;


import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://Facebook.com");  
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertTrue(title.contains("Facebook – log in or sign up")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			
			 String exePath = "C:\\Users\\sthangasamy\\Desktop\\Padi\\ChromeDriver\\chromedriver.exe";
			 System.setProperty("webdriver.chrome.driver", exePath);
			 driver = new ChromeDriver();  
		    
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	

