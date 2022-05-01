package project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popupwindow {

	public static void main(String[] args) throws InterruptedException {
        
		http://omayo.blogspot.com///webDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.findElement(By.id("alert1")).click();
		Alert alret=driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText=alret.getText();
		System.out.println(alret.getText());
		alret.accept();
	//	driver.close();
	//	driver.findElement(By.id("drop1")).click();
		

	}	

}
