package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class Digitaldownloads {



    @When("Customer clicks on Digital downloads")
    public void customer_clicks_on_digital_downloads() {
        chrome.findElement(By.partialLinkText("Digital downloads")).click();
    }
    @Then("Customer should see Digital downloads page")
    public void customer_should_see_digital_downloads_page() {
        String text = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Digital downloads",text);

    }


}
