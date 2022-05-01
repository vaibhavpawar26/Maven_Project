package comenfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmLogin {
	public void hrmLogin() {
	 WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");

     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
     driver.findElement(By.id("btnLogin")).click();

}
}