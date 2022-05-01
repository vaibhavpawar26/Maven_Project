package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriverManager.chromedriver().setup();
           ChromeDriver driver = new ChromeDriver();
          driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
         driver.findElement(By.id("txtUsername")).sendKeys("Admin");

         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
         driver.findElement(By.id("btnLogin")).click();
         driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
         driver.findElement(By.id("searchBtn")).click();
         String exepectedResult="odis";
         String actualResult="Odis";
         String expectedResult=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")).getText();
         
           
	}

}
