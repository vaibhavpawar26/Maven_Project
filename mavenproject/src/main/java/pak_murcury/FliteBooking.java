package pak_murcury;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

 public class FliteBooking {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/flights");
		driver.findElement(By.xpath("//*[@id=\"left-search\"]/div[1]/div/label[2]/input")).click();
		driver.findElement(By.name("fromCity")).sendKeys("hydrabad");
		driver.findElement(By.name("toCity")).sendKeys("mumbai");
		driver.findElement(By.id("dpf1")).click();
		//driver.findElement(By.xpath("/html/body/div[16]/div[1]/table/tbody/tr[2]/td[2]")).click();
	//	driver.findElement(By.id("dpf1")).sendKeys("05/04/2022");
	//	driver.findElement(By.className("day")).click();
        driver.findElement(By.xpath("//table[@className='day']/tbody/tr[5]td[5]")).click();

      
        





        
        
        
}
 }