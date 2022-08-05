package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class dataprovider
{
  public WebDriver d;
  @Test(dataProvider = "dp")
  public void search( String username, String password)
  {
	  System.setProperty("webdriver.chrome.driver", "C://jeet material//chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://www.facebook.com/");
	  d.manage().window().maximize();
	  WebElement user = d.findElement(By.xpath("//input[@id='email']"));
	  WebElement pass = d.findElement(By.xpath("//input[@id='pass']"));
	  WebElement button = d.findElement(By.xpath("//button[@name='login']"));
	  user.sendKeys(username);
	  pass.sendKeys(password);
	  button.click();
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    		{
      new Object[] {"jeetamnur1804@gmail.com","12345"},
      new Object[] {"amnurjeet1804@gmail.com","24589"},
    };
  }
}
