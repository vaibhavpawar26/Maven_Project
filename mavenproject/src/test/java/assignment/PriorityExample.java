package assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityExample {
	public class Priority_Program {
		@Test(priority=1)
		public void a() {
			System.out.println("Test Case 1");
		}

		@Test(priority=3)
		public void b() {
			System.out.println("Test Case 2");
		}

		@Test(priority=4)
		public void c() {
			System.out.println("Test Case 3");
		}
		
		@Test(priority=2)
		public void d() {
			System.out.println("Test Case 4");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Before Method Executed");
		}

		@AfterMethod
		public void afterMethod() {
			System.out.println("After Method Executed");
		}

		@BeforeClass
		public void beforeClass() {
			System.out.println("Before Class Executed");
		}

		@AfterClass
		public void afterClass() {
			System.out.println("After Class Executed");
			System.out.println("End");
		}
	}
}