package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class search {
    
        WebDriver driver;
        WebElement login,email,Password,search;
        
        
        public search(WebDriver driver)
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
        void clicksearch() throws InterruptedException
        {
        	WebElement search = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
            search.sendKeys("$5 Virtual Gift Card");
            search.click();
            WebElement search2 = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
            search2.sendKeys(" "); 
            search2.click();
            Thread.sleep(500);
            WebElement search3 = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
            search3.sendKeys("sarees"); 
            search3.click();
            Thread.sleep(500);
        }
        
    }