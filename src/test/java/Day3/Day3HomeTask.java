package Day3;

import io.github.bonigarcia.wdm.WdmAgent;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.TypeCache;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.crypto.Cipher;
import java.util.concurrent.TimeUnit;

public class Day3HomeTask {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://demowebshop.tricentis.com//");

        WebElement Computers = chrome.findElement(By.partialLinkText("Computers"));
        Computers.click();
        WebElement Notebooks = chrome.findElement(By.className("item-box"));
        Notebooks.click();
        WebElement Addtocart1 = chrome.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        Addtocart1.click();
        ///Thread.sleep(1000);
        chrome.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement Addtocart2 = chrome.findElement(By.id("add-to-cart-button-72"));
        Addtocart2.click();
        ///Thread.sleep(4000);
        chrome.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement Shoppingcart = chrome.findElement(By.className("cart-label"));
        Shoppingcart.click();
        WebElement Country = chrome.findElement(By.className("country-input"));
        Country.sendKeys("United States");
        WebElement Iagreebutoon = chrome.findElement(By.id("termsofservice"));
        Iagreebutoon.click();
        WebElement Checkout = chrome.findElement(By.id("checkout"));
        Checkout.click();
        WebElement Checkoutasguest = chrome.findElement(By.cssSelector(".button-1.checkout-as-guest-button"));
        Checkoutasguest.click();
        ///Thread.sleep(1000);
        chrome.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement Firstname = chrome.findElement(By.id("BillingNewAddress_FirstName"));
        Firstname.sendKeys("Bob");
        WebElement Lastname = chrome.findElement(By.id("BillingNewAddress_LastName"));
        Lastname.sendKeys("Peterson");
        WebElement Email = chrome.findElement(By.id("BillingNewAddress_Email"));
        Email.sendKeys("anvark76@gmail.com");
        WebElement Selectcountry = chrome.findElement(By.id("BillingNewAddress_CountryId"));
        Selectcountry.sendKeys("United States");
        WebElement City = chrome.findElement(By.id("BillingNewAddress_City"));
        City.sendKeys("Pittsburgh");
        WebElement Address = chrome.findElement(By.id("BillingNewAddress_Address1"));
        Address.sendKeys("608 Deauville dr");
        WebElement Zipcod = chrome.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        Zipcod.sendKeys("15146");
        WebElement Phonenumber = chrome.findElement(By.id("BillingNewAddress_PhoneNumber"));
        Phonenumber.sendKeys("3475869529");
        WebElement ContinueBillingAddress = chrome.findElement(By.cssSelector(".button-1.new-address-next-step-button"));
        ContinueBillingAddress.click();
        ///Thread.sleep(1000);
        chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement Instorepickup = chrome.findElement(By.id("PickUpInStore"));
        Instorepickup.click();
        WebElement ContinueShippingAddress = chrome.findElement(By.cssSelector(" #checkout-step-shipping .button-1.new-address-next-step-button"));
        ContinueShippingAddress.click();
        ///Thread.sleep(1000);
        chrome.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
        WebElement ContinuePaymentmethod = chrome.findElement(By.cssSelector(".button-1.payment-method-next-step-button"));
        ContinuePaymentmethod.click();
        ///Thread.sleep(1000);
        chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement ContinuePaymentInformation = chrome.findElement(By.cssSelector(".button-1.payment-info-next-step-button"));
        ContinuePaymentInformation.click();
        ///Thread.sleep(1000);
        chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement ContinueConfirmOrder = chrome.findElement(By.cssSelector(".button-1.confirm-order-next-step-button"));
        ContinueConfirmOrder.click();
        chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement successfully = chrome.findElement(By.cssSelector(".title"));
        System.out.println(successfully.getText());
        ///Thread.sleep(2000);
        chrome.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebElement ContinueThankyou = chrome.findElement(By.cssSelector(".button-2.order-completed-continue-button"));
        ContinueThankyou.click();

    }
}
