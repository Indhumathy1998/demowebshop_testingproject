package project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tc4_search {
    WebDriver driver;
    WebElement login,email,password,search,view;
    
    @Given("^the user is in main page$")
    public void the_user_is_in_main_page() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        tc4_search search = new tc4_search();
    }
    
    @When("^the user wants to search product$")
    public void the_user_wants_to_search_product() throws InterruptedException {
    	login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("indhudazzling98@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
        login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
	    login.click();
	    Thread.sleep(500);
        WebElement search1 = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        search1.sendKeys("$5 Virtual Gift Card");
        search1.click();
        Thread.sleep(500);
        }
    @Then("^the system displays the product$")
    public void the_system_displays_the_product() throws InterruptedException {
    	
    	WebElement click1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
        click1.click();
    	driver.quit();
    }
    @Given("^the user is in main page 2$")
    public void the_user_is_in_main_page_2() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        tc4_search search = new tc4_search();
    }
    @When("^the user wants to search invalid product$")
    public void the_user_wants_to_search_invalid_product() throws InterruptedException {
    	
    	WebElement search2 = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        search2.sendKeys(" "); 
        search2.click();
        Thread.sleep(500);
    }
    @Then("^the system displays the error message1$")
    public void the_system_displays_the_error_message1() throws InterruptedException {
    	WebElement click2 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
        click2.click();
    	driver.quit();
    }
    @Given("^the user is in main page 3$")
    public void the_user_is_in_main_page_3() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        tc4_search search = new tc4_search();
    }
    @When("^the user wants to search empty product$")
    public void the_user_wants_to_search_empty_product() throws InterruptedException {
    	
    	WebElement search3 = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        search3.sendKeys("sarees"); 
        search3.click();
        Thread.sleep(500);
    }
    @Then("^the system displays the error message2$")
    public void the_system_displays_the_error_message2() throws InterruptedException {
    	
    	WebElement click3 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
        click3.click();
    	driver.quit();
    }
}