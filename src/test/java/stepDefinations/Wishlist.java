package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class Wishlist {




    @When("Customer clicks on book")
    public void customer_clicks_on_book() throws InterruptedException {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector(".product-title")).click();
    }

    @When("Customer clicks on add to wishlist")
    public void customer_clicks_on_add_to_wishlist() {
        chrome.findElement(By.cssSelector("#add-to-wishlist-button-22")).click();
    }
    @Then("Wishlist should get updated \\({int}) to \\({int})")
    public void wishlist_should_get_updated_to(Integer int1, Integer int2) throws InterruptedException {
      Thread.sleep(2000);
      String one = chrome.findElement(By.cssSelector(".wishlist-qty")).getText();
      assertEquals("(1)",one);





    }

}
