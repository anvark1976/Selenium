package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinations.TestSuiteSetUp.chrome;

public class Purchase {



    @Given("Customer is on DemoShop home page")
    public void customer_is_on_demo_shop_home_page() {
        chrome.get("http://demowebshop.tricentis.com//");
    }

    @When("Customer clicks on books")
    public void customer_clicks_on_inch_laptop() {
        WebElement Books = chrome.findElement(By.partialLinkText("Books"));
        Books.click();
    }

    @Then("Customer should see the Books header")
    public void customer_should_see_the_books_header() {
    WebElement title = chrome.findElement(By.cssSelector(".page-title"));
  ///      System.out.println(title.getText());
        assertEquals("Books", title.getText());
    }

    @Then("Customer should see sort by element")
    public void customer_should_see_sort_by_element() {
        WebElement sortBy = chrome.findElement(By.cssSelector("#products-orderby"));
        System.out.println(sortBy.isDisplayed());
    }


    @When("Customer orders by price low to high")
    public void customer_orders_by_price_low_to_high() {
        WebElement Sortby = chrome.findElement(By.id("products-orderby"));
        Sortby.sendKeys("Price: Low to High");
    }

    @When("Customer changes the view to list")
    public void customer_changes_the_view_to_list() {
        WebElement ViewAs = chrome.findElement(By.id("products-viewmode"));
        ViewAs.sendKeys("List");
    }

    @When("Customer adds the first book to cart")
    public void customer_adds_the_first_book_to_cart() {
        List<WebElement> addToCarts = chrome.findElements(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        WebElement addToCart1 = addToCarts.get(0);
        addToCart1.click();
    }


    @Then("Customer should see updated cart")
    public void customer_should_see_updated_cart() throws InterruptedException {
        Thread.sleep(2000);
 //       chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement ShoppingCart = chrome.findElement(By.cssSelector(".cart-qty"));
//        System.out.println(ShoppingCart.getText());
        assertEquals("(1)",ShoppingCart.getText());

    }

    @When("Customer clicks on shopping cart")
    public void customer_clicks_on_shopping_cart() {
        WebElement ClicAddcart = chrome.findElement(By.id("topcartlink"));
        ClicAddcart.click();
    }
    @Then("Customer should land on Shopping Cart page")
    public void customer_should_land_on_shopping_cart_page() {
        WebElement ShoppingCarttitle = chrome.findElement(By.cssSelector(".page-title"));
 //       System.out.println(ShoppingCarttitle.getText());
        assertEquals("Shopping cart",ShoppingCarttitle.getText());
    }


    @When("Customer select Country from the list")
    public void customer_select_country_from_the_list() {
        WebElement Country = chrome.findElement(By.id("CountryId"));
        Country.sendKeys("United States");
    }

    @When("customer click i agree button")
    public void customer_click_i_agree_button() {
        WebElement Iagreebutton = chrome.findElement(By.id("termsofservice"));
        Iagreebutton.click();
    }

    @When("Customer clicks Checkout button")
    public void customer_clicks_checkout_button() {
        WebElement Checkout = chrome.findElement(By.id("checkout"));
        Checkout.click();
    }

    @Then("Customer should see next page")
    public void customer_should_see_next_page() {
        WebElement Welcomepage = chrome.findElement(By.cssSelector(".page-title"));
 //       System.out.println(Welcomepage.getText());
        assertEquals("Welcome, Please Sign In!",Welcomepage.getText());

    }

    @When("Customer clicks on check-out-as-guest")
    public void customer_clicks_on_check_out_as_guest() {
        WebElement CheckoutasGuest = chrome.findElement(By.cssSelector(".button-1.checkout-as-guest-button"));
        CheckoutasGuest.click();
    }

    @Then("Customer should see Checkout list")
    public void customer_should_see_checkout_list() {
        WebElement Checkout = chrome.findElement(By.cssSelector(".page-title"));
       // System.out.println(Checkout.getText());
        assertEquals("Checkout",Checkout.getText());
    }


    @When("Customer fill billing address first name")
    public void customer_fill_billing_address_first_name() {
        WebElement Firstname = chrome.findElement(By.id("BillingNewAddress_FirstName"));
        Firstname.sendKeys("Anvar");
    }

    @When("Customer enter Last name")
    public void customer_enter_last_name() {
        WebElement Lastname = chrome.findElement(By.id("BillingNewAddress_LastName"));
        Lastname.sendKeys("Karabekov");
    }

    @When("Customer enter Email adress")
    public void customer_enter_email_adress() {
        WebElement Email = chrome.findElement(By.id("BillingNewAddress_Email"));
        Email.sendKeys("anvark76@gmail.com");
    }

    @When("Customer select Country")
    public void customer_select_country() {
        WebElement Country1 = chrome.findElement(By.id("BillingNewAddress_CountryId"));
        Country1.sendKeys("United States");
    }

    @When("Customer select City")
    public void customer_select_city() {
        WebElement City = chrome.findElement(By.id("BillingNewAddress_City"));
        City.sendKeys("Pittsburgh");
    }

    @When("Customer fill address button")
    public void customer_fill_address_button() {
        WebElement Address = chrome.findElement(By.id("BillingNewAddress_Address1"));
        Address.sendKeys("641 Deauville dr");
    }

    @When("Customer enter Zip code")
    public void customer_enter_zip_code() {
        WebElement Zipcode = chrome.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Zipcode.sendKeys("15146");
    }

    @When("Customer enter Phone number")
    public void customer_enter_phone_number() {
        WebElement Phonenumber = chrome.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Phonenumber.sendKeys("3472586325");
    }

    @Then("Customer click to the Continue button Customer should see next button")
    public void customer_click_to_the_continue_button_customer_should_see_next_button() throws InterruptedException {

    }


    @When("Customer clicks on billing continue")
    public void customer_clicks_on_billing_continue() {
        WebElement Continue = chrome.findElement(By.cssSelector(".button-1.new-address-next-step-button"));
        Continue.click();
    }
    @Then("Customer should see disabled billing tab")
    public void customer_should_see_disabled_billing_tab() {

    }


    @When("Customer clicks on pick up in store checkbox")
    public void customer_clicks_on_pick_up_in_store_checkbox() throws InterruptedException {
       // Thread.sleep(3000);
        chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement Shippingadress = chrome.findElement(By.id("PickUpInStore"));
        Shippingadress.click();

    }

    @When("Customer clicks on continue button")
    public void customer_clicks_on_continue_button() throws InterruptedException {
        //Thread.sleep(2000);
        chrome.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement ContinueShipping = chrome.findElement(By.cssSelector("#checkout-step-shipping .button-1.new-address-next-step-button"));
        ContinueShipping.click();

    }

    @Then("Payment tab becomes active")
    public void payment_tab_becomes_active() throws InterruptedException {

    }

    @When("Customer clicks on payment info continue")
    public void customer_clicks_on_continue() throws InterruptedException {
        //Thread.sleep(2000);
        chrome.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
        WebElement Continue3 = chrome.findElement(By.cssSelector(".button-1.payment-info-next-step-button"));
        Continue3.click();


    }

    @When("Customer click on payment method continue")
    public void customer_click_on_continue() throws InterruptedException {
        //Thread.sleep(2000);
        chrome.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement Continue2 = chrome.findElement(By.cssSelector(".button-1.payment-method-next-step-button"));
        Continue2.click();

    }
    @Then("Payment tab becomes disabled")
    public void payment_tab_becomes_disabled() throws InterruptedException {


    }

    @Then("Confirm page becomes active")
    public void confirm_page_becomes_active() throws InterruptedException {

    }

    @When("Costomer clicks on confirm")
    public void costomer_clicks_on_confirm() throws InterruptedException {
        //Thread.sleep(2000);
        chrome.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement Confirmbutton = chrome.findElement(By.cssSelector(".button-1.confirm-order-next-step-button"));
        Confirmbutton.click();



    }
        @Then("Order number is genereted")
        public void order_number_is_genereted () throws InterruptedException {
        Thread.sleep(2000);
        ///chrome.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement successfully = chrome.findElement(By.className("page-title"));
     ///   System.out.println(successfully.getText());
        assertEquals("Thank you",successfully.getText());


        }




}