package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Addtocart {
    
        WebDriver driver;
        WebElement btnComputers,login,btndesktops,btnBuild_your_own_cheap_computer,addtocart;
        
        public Addtocart(WebDriver driver)
        {
            this.driver= driver;
        }
        void clicklogin()
        {
        login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("indhudazzling98@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
        }
        void clickbtncomputers()
        {
        	WebElement enter = driver.findElement(By.linkText("Computers"));
    		btnComputers.click();
        }
        void clickbtndesktops()
        {
        	WebElement btndesktops = driver.findElement(By.linkText("Desktops"));
    		btndesktops.click();
        }
        
        void clickbtnBuild_your_own_cheap_computer()
        {
        	WebElement btnBuild_your_own_cheap_computer = driver.findElement(By.linkText("Build your own cheap computer"));
        	btnBuild_your_own_cheap_computer.click();
        }
        void clickaddtocart()
        {
        	WebElement btnAdd_to_cart = driver.findElement(By.linkText("Add to cart"));
        	addtocart.click();
        }
        void clickshoppingcart()
        {
        WebElement shoppingcart = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
        shoppingcart.click();
        }
        
        
    }