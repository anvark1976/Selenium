package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Demoshop {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com//");

        WebElement Good = chrome.findElement(By.id("pollanswers-2"));
        Good.click();
        WebElement Computer = chrome.findElement(By.partialLinkText("14.1-inch Laptop"));
        Computer.click();
        WebElement Addtocart = chrome.findElement(By.id("add-to-cart-button-31"));
        Addtocart.click();
        WebElement Shoppingcart = chrome.findElement(By.partialLinkText("Shopping cart"));
        Shoppingcart.click();
        WebElement Country = chrome.findElement(By.id("CountryId"));
        Country.click();
        Country.sendKeys("United States");
        WebElement Checkout = chrome.findElement(By.id("termsofservice"));
        Checkout.click();

    }
}
