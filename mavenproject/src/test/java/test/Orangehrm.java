package test;

import org.testng.annotations.Test;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class Orangehrm {

		WebDriver driver;

		@BeforeClass
		void Tester1() {
			System.out.println(" Test Cases ");
		}

		@BeforeMethod
		void Login() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			driver.findElement(By.linkText("PIM")).click();
		}

		@Test
		void TestCase1() throws InterruptedException {
			driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
			Thread.sleep(1000);
			driver.findElement(By.id("searchBtn")).click();

			String expResult = "Odis";
			String actResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")).getText();
			Assert.assertEquals(expResult, actResult);
			System.out.println("Test Case 1st Is Pass");
		}

		@Test
		void TestCase2() throws InterruptedException {
			driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
			Thread.sleep(1000);
			driver.findElement(By.id("searchBtn")).click();

			String expResult = "John Smith";
			String actResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[8]")).getText();
			Assert.assertEquals(expResult, actResult);
			System.out.println("Test Case 2nd Is Pass");
		}

		@Test
		void TestCase3() throws InterruptedException {
			driver.findElement(By.id("empsearch_id")).sendKeys("0345");
			Thread.sleep(1000);
			driver.findElement(By.id("searchBtn")).click();

			String expResult = "0345";
			String actResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getText();
			Assert.assertEquals(expResult, actResult);
			System.out.println("Test Case 3rd Is Pass");
		}

		@Test
		void TestCase4() throws InterruptedException {
			WebElement a1 = driver.findElement(By.id("empsearch_employee_status"));
			Thread.sleep(1000);
			Select A1 = new Select(a1);
			A1.selectByIndex(3);
			driver.findElement(By.id("searchBtn")).click();

			String expResult = "Full-Time Permanent";
			String actResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[6]")).getText();
			Assert.assertEquals(expResult, actResult);
			System.out.println("Test Case 4th Is Pass");
		}

		@Test
		void TestCase5() throws InterruptedException {
			WebElement a1 = driver.findElement(By.id("empsearch_termination"));
			Thread.sleep(1000);
			Select A1 = new Select(a1);
			A1.selectByIndex(0);
			driver.findElement(By.id("searchBtn")).click();

			String expResult = "Full-Time Permanent";
			String actResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[6]")).getText();
			Assert.assertEquals(expResult, actResult);
			System.out.println("Test Case 5th Is Pass");
		}

		@Test
		void TestCase6() throws InterruptedException {
			WebElement a1 = driver.findElement(By.id("empsearch_job_title"));
			Thread.sleep(1000);
			Select A1 = new Select(a1);
			A1.selectByIndex(9);
			driver.findElement(By.id("searchBtn")).click();

			String expResult = "Engineer";
			String actResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[5]")).getText();
			Assert.assertEquals(expResult, actResult);
			System.out.println("Test Case 6th Is Pass");
		}

		@Test
		void TestCase7() throws InterruptedException {
			WebElement a1 = driver.findElement(By.id("empsearch_sub_unit"));
			Thread.sleep(1000);
			Select A1 = new Select(a1);
			A1.selectByIndex(1);
			driver.findElement(By.id("searchBtn")).click();

			String expResult = "Administration";
			String actResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[7]")).getText();
			Assert.assertEquals(expResult, actResult);
			System.out.println("Test Case 7th Is Pass By");
		}

		@Test
		void TestCase8() {
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]")).click();

			String expResult = "welcome";
			String actResult = driver.findElement(By.id("welcome")).getText();
			Assert.assertEquals(expResult, actResult);
			System.out.println("Test Case 8th Is Pass By");
		}

		@AfterMethod
		void Clouser() {
			driver.close();
}
}