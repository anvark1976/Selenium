package Day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.SchemaOutputResolver;

import static org.junit.Assert.assertEquals;

public class Day8LoginHomework {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com//");

        WebElement Welcometoourstore = chrome.findElement(By.cssSelector(".topic-html-content-header"));
        ///System.out.println(Welcometoourstore.getText());
        assertEquals("Welcome to our store", Welcometoourstore.getText());
        WebElement Login = chrome.findElement(By.cssSelector(".ico-login"));
        Login.click();

        WebElement WelcomePleaseSignIn = chrome.findElement(By.cssSelector(".page-title"));
        ///System.out.println(WelcomePleaseSignIn.getText());
        assertEquals("Welcome, Please Sign In!", WelcomePleaseSignIn.getText());
        WebElement Email = chrome.findElement(By.id("Email"));
        Email.sendKeys("123123123123@gmail.com");
        WebElement Password = chrome.findElement(By.id("Password"));
        Password.sendKeys("123123");
        WebElement Rememberme = chrome.findElement(By.id("RememberMe"));
        Rememberme.click();
        WebElement Login2 = chrome.findElement(By.cssSelector(".button-1.login-button"));
        Login2.click();

        WebElement Logout = chrome.findElement(By.cssSelector(".ico-logout"));
        ///System.out.println(Logout.getText());
        assertEquals("Log out", Logout.getText());


    }
}
