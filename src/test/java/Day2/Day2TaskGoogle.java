package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2TaskGoogle {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://google.com/");
        WebElement searchBar = chrome.findElement(By.name("q"));
        searchBar.sendKeys("Dog");
        searchBar.submit();

        WebElement link = chrome.findElement(By.partialLinkText("Dog - Wikipedia"));
        link.click();
    }
}
