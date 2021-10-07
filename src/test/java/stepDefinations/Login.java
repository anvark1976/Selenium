package stepDefinations;

import Day3.Day3Demoshop;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class Login {


    @Given("Customer is on DemoShop home page Login")
    public void customer_is_on_demo_shop_home_page_login() {

       chrome.get("http://demowebshop.tricentis.com//");
    }
    @When("Customer clicks on log in link")
    public void customer_clicks_on_log_in() {
        chrome.findElement(By.cssSelector("a.ico-login")).click();

    }
    @Then("Customer should lan on sign in page")
    public void customer_should_lan_on_sign_in_page() {
    String title = chrome.findElement(By.cssSelector(".page-title")).getText();
    assertEquals("Welcome, Please Sign In!", title);
    }
    @When("Customer enter email")
    public void customer_enter_email() {
    chrome.findElement(By.cssSelector("#Email")).sendKeys("123412341234@gmail.com");
    }
    @When("Customer enters valid password")
    public void customer_enters_valid_password() {
        chrome.findElement(By.cssSelector("#Password")).sendKeys("123412341234");
    }

    @When("Customer click on remember me")
    public void customer_click_on_remember_me() {
        chrome.findElement(By.cssSelector("#RememberMe")).click();
    }

    @When("Customer click log in button")
    public void customer_click_log_in() {
        chrome.findElement(By.cssSelector(".button-1.login-button")).click();
    }
    @Then("Customer should see log out")
    public void customer_should_see_log_out() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String xyz= chrome.findElement(By.cssSelector(".ico-logout")).getText();
       assertEquals("Log out",xyz);
    }



}
