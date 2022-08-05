package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assetd 
{
	public WebDriver d;
  @Test
  public void launch() 
  {
	  System.setProperty("webdriver.chrome.driver", "C://jeet material//chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://www.amazon.com");
	  String title =d.getTitle();
	  System.out.println(title);
	  String expected = "Amazon.com. Spend less. Smile more.";
	  String actual = d.getTitle();
	  SoftAssert s = new SoftAssert();//softassert type
	  s.assertEquals(actual, expected);
	  s.assertAll();
	  d.navigate().to("https://www.flipkart.com");
	  d.manage().window().maximize();
	  
	  
  }
}
