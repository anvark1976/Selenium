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

public class AddingToCart {




    @Given("Customer is on DemoShop home page book")
    public void customer_is_on_demo_shop_home_page_book() {


        chrome.get("http://demowebshop.tricentis.com//");

    }
    @When("Customer searches for a book")
    public void customer_searches_for_a_book() {

        WebElement bar = chrome.findElement(By.cssSelector("#small-searchterms"));
        bar.sendKeys("book");
        bar.submit();



    }
    @Then("Customer is on search page")
    public void customer_is_on_search_page() {
        String ola = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals("Search", ola);
    }
    @When("Customer clicks on add to cart")
    public void customer_clicks_on_add_to_cart() {
        chrome.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();

    }
    @Then("Shopping cart should get updated \\({int}) to \\({int})")
    public void shopping_cart_should_get_updated_to(Integer int1, Integer int2) throws InterruptedException {
        Thread.sleep(2000);
        String one = chrome.findElement(By.cssSelector(".cart-qty")).getText();
        assertEquals("(1)",one);
    }


}
