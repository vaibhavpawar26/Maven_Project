package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmFrogate {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		Driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Driver.findElement(By.linkText("Forgot your password?")).click();
		Driver.findElement(By.xpath("//*[@id=\"btnCancel\"]")).click();
		//String expectedresult =
		
		
		
		

	}

}
