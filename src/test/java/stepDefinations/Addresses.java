package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class Addresses {


    @When("Customer clicks on addresses link")
    public void customer_clicks_on_addresses_link() {
        chrome.findElement(By.partialLinkText("Addresses")).click();

    }

    @Then("Customer should see My account Addresses")
    public void customer_should_see_my_account_addresses() {
        String text = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("My account - Addresses",text);
    }

    @Then("Customer should verify name John Smith")
    public void customer_should_verify_name_john_smith() {
        String text1= chrome.findElement(By.cssSelector(".info li:nth-child(1)")).getText();
        assertEquals ("John Smith",text1);


    }


}
