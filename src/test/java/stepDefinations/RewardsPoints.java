package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class RewardsPoints {

    @When("Customer click My account")
    public void customer_click_my_account() {
         chrome.findElement(By.cssSelector(".account")).click();

    }
    @Then("Customer should lan on My account - Customer info  page")
    public void customer_should_lan_on_my_account_customer_info_page() {
        String text = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("My account - Customer info",text);
    }
    @When("Customer click Reward points link")
    public void customer_click_reward_points_link() {
        chrome.findElement(By.partialLinkText("Reward points")).click();
    }
    @Then("Customer should lan on My account - Reward points page")
    public void customer_should_lan_on_my_account_reward_points_page() throws InterruptedException {
        Thread.sleep(2000);
        String text1= chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("My account - Reward points",text1);

    }
    @Then("Customer should verify the text Your current balance is {int} reward points \\({double}).")
    public void customer_should_verify_the_text_your_current_balance_is_reward_points(Integer int1, Double double1) {
        String text2 = chrome.findElement(By.cssSelector(".current-balance")).getText();
        assertEquals("Your current balance is 0 reward points (0.00).",text2);

    }

}
