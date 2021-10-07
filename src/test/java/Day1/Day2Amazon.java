package Day1;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Day2Amazon {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://amazon.com/");
        WebElement searchBar = chrome.findElement(By.name("field-keywords"));
        searchBar.sendKeys("gift cards");
        searchBar.submit();
        WebElement Giftcart = chrome.findElement(By.partialLinkText("Roblox Gift Card - 800 Robux [Includes Exclusive Virtual Item] [Online Game Code]"));
        Giftcart.click();
        WebElement Addtocart = chrome.findElement(By.id("add-to-cart-button"));
        Addtocart.click();
        ///WebElement button = chrome.findElement(By.id("nav-cart"));
        ///button.click();
        ///WebElement link = chrome.findElement(By.id("a-autoid-0"));
        ///link.click();
        ///WebElement email = chrome.findElement(By.name("email"));
        ///email.sendKeys ("anvark76@gmail.com");
        ///WebElement continueButton  = chrome.findElement(By.id("continue"));
        ///continueButton.click();




    }
}
