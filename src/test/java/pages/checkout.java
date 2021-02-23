package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class checkout {
    
        WebDriver driver;
        
        public checkout(WebDriver driver)
        {
            this.driver= driver;
        }
        void clicklogin()
        {
        WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    login.click();
	    WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("indhudazzling98@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pass123");
        }
        void clickbtncomputers()
        {
        	WebElement btnComputers = driver.findElement(By.linkText("Computers"));
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
        	btnAdd_to_cart.click();
        }
        void clickshoppingcart()
        {
        WebElement shoppingcart = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
        shoppingcart.click();
        }
        void clickagreetotermsandconditions()
        {
        	WebElement agreetotermsandconditions = driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
            agreetotermsandconditions.click();
        }
        void clickcheckout()
        {
        	WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
            checkout.click();
        }
        void clickbillingaddress()
        {
        	WebElement billingaddress = driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]"));
            billingaddress.sendKeys("John Max,no 85,chennai607105,India");
            billingaddress.click();
        }
        void clickContinue1()
        {
        	WebElement Continue1 = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
            Continue1.click();
        }
        void clickshippingaddress()
        {
        	WebElement shippingaddress = driver.findElement(By.xpath("//*[@id=\"shipping-address-select\"]"));
            shippingaddress.sendKeys("John Max, no 85, chennai607105, India");
            shippingaddress.click();
        }
        void clickContinue2()
        {
        	WebElement Continue2 = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
            Continue2.click();
        }
        void clickshippingmethod()
        {
        	WebElement shippingmethod = driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/div/div/ul/li[1]/div[1]/label"));
            shippingmethod.click();
        }
        void clickContinue3()
        {
        	WebElement Continue3 = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
            Continue3.click();
        }
        void clickpaymentmethod()
        {
        	WebElement paymentmethod = driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/div/div/ul/li[1]/div[1]/label"));
            paymentmethod.click();
        }
        void clickContinue4()
        {
        	WebElement Continue4 = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/ul/li[1]/div/div[2]/label"));
            Continue4.click();
        }
}