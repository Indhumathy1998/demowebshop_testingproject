package project;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import pages.Logout;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tc3_Logout {
	 WebDriver driver;
	WebElement username,password,Login,login;
	@Given("^the user is in Homepage$")
	public void the_user_is_in_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        tc3_Logout logoutpages = new tc3_Logout();
        Login = driver.findElement(By.linkText("Log in"));
        Login.click();
        username = driver.findElement(By.name("Email"));
        password = driver.findElement(By.name("Password"));
        username.sendKeys("indhumathymani12@gmail.com");
        password.sendKeys("pass123");
        login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        login.click();
        
        Thread.sleep(6000);
	}

	@When("^the user click on logout$")
	public void the_user_click_on_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement logout=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	   logout.click();
	   Thread.sleep(6000);
	}
	

	@Then("^the System displays Homepage$")
	public void the_System_displays_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

}