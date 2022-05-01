package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	   	WebDriver driver = new ChromeDriver();
	   //driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  // driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  // driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  // Thread.sleep(3000);
	  // driver.findElement(By.name("Submit")).click();
	 //  Thread.sleep(3000);

	 //  driver.navigate().back();
	 //  Thread.sleep(3000);

	   driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
	   Thread.sleep(3000);

	   driver.findElement(By.xpath("//*[@id=\"btnCancel\"]")).click();
	   Thread.sleep(3000);

	


	}
}
