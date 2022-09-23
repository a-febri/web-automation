package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import starter.Pages.CartPage;
import starter.Pages.CheckoutStep1Page;
import static org.junit.Assert.assertEquals;

public class CheckoutStepDef {
    CartPage cartPage=new CartPage();
    CheckoutStep1Page checkoutStep1Page= new CheckoutStep1Page();
    @And("I click on checkout button")
    public void i_click_on_checkout_button() {
        cartPage.clickCheckoutButton();
    }
    @Then("I redirected to checkout step one page")
    public void i_redirected_to_checkout_step_one_page() {
        assertEquals("https://www.saucedemo.com/checkout-step-one.html",checkoutStep1Page.getUrl());
        assertEquals("CHECKOUT: YOUR INFORMATION",checkoutStep1Page.getHeaderTitle());
    }
}
