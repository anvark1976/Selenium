package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class Newsletter {

    @When("Customer enters an Email")
    public void customer_enters_an_email() {
        chrome.findElement(By.cssSelector("#newsletter-email")).sendKeys("123123123123@gmail.com");
    }
    @When("Customer clicks on Subscribe")
    public void customer_clicks_on_subscribe() {
        chrome.findElement(By.cssSelector("#newsletter-subscribe-button")).click();
    }
    @Then("Customer should see Subscribtion is successful")
    public void customer_should_see_subscribtion_is_successful() throws InterruptedException {
        Thread.sleep(2000);
        String text =chrome.findElement(By.cssSelector("#newsletter-result-block.newsletter-result-block")).getText();
        assertEquals("Thank you for signing up! A verification email has been sent. We appreciate your interest.",text );


    }


}
