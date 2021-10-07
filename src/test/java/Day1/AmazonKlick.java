package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonKlick {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://www.amazon.com/");

        WebElement searchBar = chrome.findElement(By.name("field-keywords"));
        searchBar.sendKeys("toys");
        WebElement searchbutton = chrome.findElement(By.id("nav-search-submit-button"));
        searchbutton.click();





    }
    }

