package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aistem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.aitsteam.com/Diploma/ViewReport/");
             
        driver.findElement(By.name("RegNumber")).sendKeys("AITS/A/1236/19");

        driver.findElement(By.name("StudName")).sendKeys("NAINIKA RAJ");
        driver.findElement(By.name("submit")).click(); 
        String text=driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr[3]/td[2]/strong")).getText();
        System.out.println(text);
	}

}
