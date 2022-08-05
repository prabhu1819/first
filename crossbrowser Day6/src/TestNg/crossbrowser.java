package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class crossbrowser 
{
  public WebDriver d;
  @Test
  public void launch()
  {
	    d.get("http://demo.guru99.com/V4/");
		//Find user name
		WebElement userName = d.findElement(By.name("uid"));
		//Fill user name
		userName.sendKeys("guru99");
		//Find password
		WebElement password = d.findElement(By.name("password"));
		//Fill password
		password.sendKeys("guru99");
  }
 
  @BeforeClass
  @Parameters("Browser")
	  public void setup(String Browser) 
	  {
		 if(Browser.equalsIgnoreCase("Chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C://jeet material//chromedriver.exe");
			 d = new ChromeDriver();
		 }
		 else if(Browser.equalsIgnoreCase("Edge"))
		 {
			 System.setProperty("webdriver.edge.driver", "C://jeet material//msedgedriver.exe");
			 d = new EdgeDriver();
		 }
	  }
  

  @AfterClass
  public void afterClass() 
  {
	  d.quit();
  }

}
