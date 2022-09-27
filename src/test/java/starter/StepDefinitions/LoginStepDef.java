package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;
import static org.junit.Assert.*;

public class LoginStepDef {

    LoginPage loginPage;
    InventoryPage inventoryPage= new InventoryPage();
    @Given("I already on log in page")
    public void IamAlreadyOnLoginPage(){
        loginPage.open();
    }

    @When("I input username {string}")
    public void IInputUsername (String username){
        loginPage.InputUsername(username);

    }

    @And("I input password {string}")
    public void IInputPassword (String password){
        loginPage.InputPassword(password);

    }

    @And("I click login button")
    public void IClickLoginButton (){
        loginPage.ClickLoginButton();

    }

    @Then("I redirected to inventory page")
    public void IRedirectedToInventoryPage (){
        assertEquals("https://www.saucedemo.com/inventory.html",inventoryPage.getUrl());
        assertTrue(inventoryPage.isCartVisible());
        assertEquals("PRODUCTS", inventoryPage.getHeaderTitle());
        assertTrue(inventoryPage.checkSortInventoryNameByDefault());
    }

    @Given("I Already logged in")
    public void IAlreadyLoggedIn(){
        loginPage.open();
        loginPage.InputUsername("standard_user");
        loginPage.InputPassword("secret_sauce");
        loginPage.ClickLoginButton();
    }
}
