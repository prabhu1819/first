package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class crossbrowserdemo 
{
  public WebDriver d;
  @Test(dataProvider = "dp" , invocationCount = 1)
  public void launchBrowser(Integer n, String Browser) 
  {
	    System.setProperty("webdriver.chrome.driver", "C://jeet material//chromedriver.exe");
	    d = new ChromeDriver();
        System.setProperty("webdriver.edge.driver", "C://jeet material//msedgedriver.exe");
	    d = new EdgeDriver();
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

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "Chrome" },
      new Object[] { 2, "Edge" },
    };
  }
  @AfterClass
  public void afterClass() 
  {
	  d.quit();
  }

}
