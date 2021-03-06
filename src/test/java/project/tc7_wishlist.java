package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class tc7_wishlist {
    WebDriver driver;
    WebElement login,email,password,btnComputers,btndesktops,btnBuild_your_own_cheap_computer,addtocart,enter,shoppingcart;
    
    @Given("^the user is in wishlist page$")
    public void the_user_is_in_wishlist_page() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        tc7_wishlist wishlist = new tc7_wishlist();
    }
    
    @When("^the the user updates wishlist$")
    public void the_user_updates_wishlist() throws InterruptedException {
    	login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("indhudazzling98@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
		WebElement digitaldownloads = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[5]/a"));
		digitaldownloads.click();
		WebElement select_album3 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a"));
		select_album3.click();
		WebElement addtowishlist = driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-53\"]"));
		addtowishlist.click();
		Thread.sleep(1000);
		WebElement view_wishlist = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]"));
        view_wishlist.click();
        Thread.sleep(500);
        WebElement addtocart_from_wishlist = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[2]"));
        addtocart_from_wishlist.click();
        Thread.sleep(500);
        WebElement email_a_friend = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[3]"));
        email_a_friend.click();
        WebElement friend_email = driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]"));
        friend_email.sendKeys("indhudazzling98@gmail.com");
        friend_email.click();
        WebElement email_id = driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]"));
        email_id.sendKeys("indhumathymani12@gmail.com");
        email_id.click();
        WebElement message = driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]"));
        message.sendKeys("Happy Birthday Queen");
        message.click();
        WebElement email_click = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/form/div[3]/input"));
        email_click.click();
        Thread.sleep(500);
        WebElement view2_wishlist = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]"));
        view2_wishlist.click();
        WebElement delete_items_from_wishlist = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr/td[1]/input"));
        delete_items_from_wishlist.click();
        WebElement update_wishlist = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[1]"));
        update_wishlist.click();
        WebElement view3_wishlist = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]"));
        view3_wishlist.click();
        Thread.sleep(500);
        }
    @Then("^the system displays updated wishlist$")
    public void the_system_displays_updated_wishlist() throws Throwable {
    	driver.quit();
    }
}