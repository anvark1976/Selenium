import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class Jewelry {

    @When("Customer click on Jewelry")
    public void customer_click_on_jewelry() {
        chrome.findElement(By.partialLinkText("Jewelry")).click();
    }
    @Then("Customer should see Jewelry results")
    public void customer_should_see_jewelry_results() {
        String title = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Jewelry", title);
    }

}
