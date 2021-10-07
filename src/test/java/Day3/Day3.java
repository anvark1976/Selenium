package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://amazon.com/");

        Select categories = new Select(chrome.findElement(By.id("searchDropdownBox")));
        categories.selectByValue("search-alias=appliances");
        categories.selectByVisibleText("Movies & TV");


    }
}
