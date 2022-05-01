package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignleave {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Driver.findElement(By.name("Submit")).click();
		
		Driver.findElement(By.id("menu_leave_viewLeaveModule")).click(); 
		Driver.findElement(By.id("menu_leave_assignLeave")).click(); 
		
		Driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("Orange Test");
		Driver.findElement(By.name("assignleave[txtLeaveType]")).click();
		
		WebElement a1=Driver.findElement(By.name("assignleave[txtLeaveType]"));
		Select A1=new Select(a1);
		A1.selectByValue("9");
		
		Driver.findElement(By.name("assignleave[txtFromDate]")).click();
		Driver.findElement(By.name("assignleave[txtFromDate]")).sendKeys("2022-04-01");
		Driver.findElement(By.xpath("//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[4]/img")).click();
		Driver.findElement(By.id("assignleave_txtToDate")).clear();
		
		Driver.findElement(By.name("assignleave[txtToDate]")).sendKeys("2022-04-05");
		Driver.findElement(By.xpath("//*[@id=\"frmLeaveApply\"]/fieldset/ol/li[5]/img")).click();
		WebElement a2=Driver.findElement(By.name("assignleave[partialDays]"));
		
		Select A2=new Select(a2);
		A2.selectByValue("start");
		Driver.findElement(By.xpath("//*[@id=\"assignBtn\"]")).click();
		String expectedresult = "Overlapping Leave Requests Found";
		
        String actualresult = Driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/h1")).getText();
	    Assert.assertEquals(actualresult,expectedresult);
	
		
		
		
		
		
	}

}
