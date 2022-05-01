package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.name("search")).sendKeys("india");
        driver.findElement(By.id("searchButton")).click();
        String actualresult = driver.findElement(By.id("firstHeading")).getText();
        String exepectedResult="India";
       
	    Assert.assertEquals(actualresult,exepectedResult);
	    System.out.println("the test case is pass");
	
	}

}
