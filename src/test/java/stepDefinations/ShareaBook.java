package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class ShareaBook {


    @When("Customer searching for Health book")
    public void customer_searching_for_health_book() {
        chrome.findElement(By.cssSelector("#small-searchterms")).sendKeys("book");
        chrome.findElement(By.cssSelector(".button-1.search-box-button")).click();
    }

    @When("Customer click on Health book link")
    public void customer_click_on_health_book_link() {
        chrome.findElement(By.cssSelector(".product-title")).click();
    }

    @When("Customer click on Email a friend button")
    public void customer_click_on_email_a_friend_button() {
        chrome.findElement(By.cssSelector(".button-2.email-a-friend-button")).click();
    }

    @When("Customer enters Email a friend")
    public void customer_enters_email_a_friend() {
        chrome.findElement(By.cssSelector("#FriendEmail")).sendKeys("anvark76@gmail.com");
    }

    @When("Customer click send email button")
    public void customer_click_send_email_button() {
        chrome.findElement(By.cssSelector(".button-1.send-email-a-friend-button")).click();
    }

    @Then("Customer should verify Health Book Your message has been sent.")
    public void customer_should_verify_your_message_has_been_sent() {
       String text4 =  chrome.findElement(By.cssSelector(".page-body")).getText();
        assertEquals("Health Book\n" +
                "Your message has been sent.",text4);


    }


}
