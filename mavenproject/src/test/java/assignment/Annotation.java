package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	WebDriver driver;
	@BeforeMethod
	public void mycar() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mycarhelpline.com/");
		System.out.println("Passed");
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
    
	@Test
	public void newcar() {
		driver.findElement(By.xpath("//a[contains(text(),'New Car')]")).click();
		driver.findElement(By.xpath("//*[@id=\"bodycontainer-innerpage\"]/div[1]/form/div/div[1]/div/table/tbody/tr/td[1]/ul/li[2]/a")).click();
		driver.findElement(By.cssSelector("a[onclick=\"ShowHide(278); return false;\"]")).click();
		System.out.println("passed");
	}
	/*@Test
	public void select() {
		System.out.println("Passed");
		
	}*/
	
		
	}
	

