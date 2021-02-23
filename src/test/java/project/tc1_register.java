package project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class tc1_register {
    WebDriver driver;
    WebElement register,gender,firstname,lastname,email,password,confirmpassword;
    
    @Given("^the user is in registration page$")
    public void open_application() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        tc1_register register = new tc1_register();
    }
    
    @When("^the user wants to register using his credentials$")
    public void user_clicks_an_link() throws Throwable {
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        gender = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
        gender.click();
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("indhu");
        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("mathy");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("indhudazzling98@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
        WebElement retypePassword = driver.findElement(By.id("ConfirmPassword"));
        retypePassword.sendKeys("pass123");
        register = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
        register.click();

        }
    @Then("^the user register account successfully$")
    public void he_moves_to_other_page() throws Throwable {
    	driver.quit();
    }
    
    @Given("^the user is in register page$")
    public void the_user_is_in_register_page() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        tc1_register register = new tc1_register();
    }
    
    @When("^the user wants to register using his invalid credentials$")
    public void the_user_wants_to_register_using_his_invalid_credentials() throws Throwable {
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        gender = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
        gender.click();
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("John123");
        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("Max4");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("abc@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
        WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
        ConfirmPassword.sendKeys("pass123");
        register = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
        register.click();

        }
    @Then("^the system display error message$")
    public void the_system_display_error_message() throws Throwable {
    	driver.quit();
    }
}