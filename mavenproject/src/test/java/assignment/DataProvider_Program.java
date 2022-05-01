package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Program {
	 private WebDriver driver;
	 @DataProvider(name = "myTest")
		public Object[][] createData1() {
			return new Object[][] { { "India" }, { "Brazil" }, { "Canada" }, { "Sri Lanka" }, { "England" },
					{ "United Kingdom" }, { "United States" },
	    };
	 }
  @Test(dataProvider = "myTest")
  public void testSearchCountry(String country) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("http://www.wikipedia.org/wiki/Main_Page");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("searchInput")).clear();
	    driver.findElement(By.id("searchInput")).sendKeys(country);
	    driver.findElement(By.id("searchButton")).click();
	    Thread.sleep(1000);
	    String actualResult = driver.findElement(By.id("firstHeading")).getText();
	    System.out.println("String Value is : "+actualResult);
	    Assert.assertTrue(country.equals(actualResult.trim()));
	  }
  
  @BeforeMethod
  
	  public void setUp() throws Exception {
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  
  }

