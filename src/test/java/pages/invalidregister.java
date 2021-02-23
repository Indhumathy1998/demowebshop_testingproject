package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class invalidregister {
    
        WebDriver driver;
        WebElement Firstname,Lastname,Email,Password,ConfirmPassword;
        
        public invalidregister(WebDriver driver)
        {
            this.driver= driver;
        }
        
        void enterFirstname(String s)
        {
            Firstname = driver.findElement(By.name("john123"));
            Firstname.sendKeys(s);
        }
        void enterLaststname(String s)
        {
            Lastname = driver.findElement(By.name("Max4"));
            Lastname.sendKeys(s);
        }
        void enterEmail(String s)
        {
            Email = driver.findElement(By.name("abc123@gmail.com"));
            Email.sendKeys(s);
        }
        
        void enterPassword(String s)
        {
            driver.findElement(By.name("pass123")).sendKeys(s);
        }
        void enterConfirmPassword(String s)
        {
            driver.findElement(By.name("pass123")).sendKeys(s);
        }
    }