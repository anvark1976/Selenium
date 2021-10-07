package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySubmit {
    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://www.ebay.com/");

        WebElement searchBar = chrome.findElement(By.id("gh-ac"));
        searchBar.sendKeys("home furniture");
               searchBar.submit();

    }
}
