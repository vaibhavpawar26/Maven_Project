package assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class All_Annotation {
  @Test
  public void a() {
	  System.out.println("test exwcute");
  }
	  @Test
	  public void b() {
		  System.out.println("test execute b");
	  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method execute");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method execute");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("befofe class exwcute");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class execute");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test execute");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test execute");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite execute");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftre suite execute");
  }

}
