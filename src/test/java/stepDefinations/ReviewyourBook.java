package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class ReviewyourBook {


    @When("Customer click on Add your review")
    public void customer_click_on_add_your_review() {
        chrome.findElement(By.cssSelector(".product-review-links")).click();
    }
    @When("Customer review title")
    public void customer_review_title() {
        chrome.findElement(By.cssSelector("#AddProductReview_Title")).sendKeys("123");

    }
    @When("Customer review text")
    public void customer_review_text() throws InterruptedException {
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector("#AddProductReview_ReviewText")).sendKeys("123");

    }
    @When("Customer clicks submit review button")
    public void customer_clicks_submit_review_button() throws InterruptedException {
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector(".button-1.write-product-review-button")).click();

    }
    @Then("Customer should see review result")
    public void customer_should_see_review_result() throws InterruptedException {
        Thread.sleep(1000);
        String gettext = chrome.findElement(By.cssSelector(".result")).getText();
        assertEquals("Product review is successfully added.",gettext);

    }


}
