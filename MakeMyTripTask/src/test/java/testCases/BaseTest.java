package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest 
{    
	public WebDriver driver;
	
	@BeforeClass
    public void setup()
  {  
     
     driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.makemytrip.com/");
	 
	 driver.manage().deleteAllCookies();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
  }
  
     @AfterClass
    public void teardown()
  {
   	 driver.quit();
  }
}
