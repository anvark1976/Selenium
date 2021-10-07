package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class CommunityPoll {


    @When("Customer clicks on Excellent button")
    public void customer_clicks_on_excellent_button() {
        chrome.findElement(By.cssSelector("#pollanswers-1")).click();
    }
    @When("Customer clicks on vote button")
    public void customer_clicks_on_vote_button() {
        chrome.findElement(By.cssSelector("#vote-poll-1")).click();
    }
    @Then("customer should see error message\\(Only registered users can vote)")
    public void customer_should_see_error_message_only_registered_users_can_vote() throws InterruptedException {
        Thread.sleep(2000);
        String text = chrome.findElement(By.cssSelector("#block-poll-vote-error-1")).getText();
        assertEquals("Only registered users can vote.",text);
    }


}
