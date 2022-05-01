package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Omaya_Blocspot {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement A1=driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
		Actions action=new Actions(driver);
		action.doubleClick(A1).perform();
  }
  @BeforeMethod
  public void beforeMethod() {
	
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
