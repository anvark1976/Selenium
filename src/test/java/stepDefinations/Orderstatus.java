package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class Orderstatus {




    @Then("Customer see My account order page")
    public void customer_see_my_account_order_page() {
        chrome.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       String text= chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("My account - Orders",text);
    }

    @When("Customer clicks on order link")
    public void customer_clicks_on_order_button() {
        chrome.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        chrome.findElement((By.partialLinkText("Orders"))).click();
    }

    @Then("Customer see order status pending")
    public void customer_see_order_status_pending() throws InterruptedException {
        //Thread.sleep(2000);
        chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String text1 = chrome.findElement(By.cssSelector(".info li:nth-child(1)")).getText();
        assertEquals("Order status: Pending",text1);

    }


}
