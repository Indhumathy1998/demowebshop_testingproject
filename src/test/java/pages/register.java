package pages;

import org.testng.annotations.Test;

import project.tc1_register;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class register {
	 
  @Test(priority = 1)
  public void f() {
	  
	  System.out.println("register Given executed successfully");
      
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("register when executed successfully");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("register then executed successfully");
  }

}
