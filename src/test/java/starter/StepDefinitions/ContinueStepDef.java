package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;

public class ContinueStepDef {
    InventoryPage inventoryPage = new InventoryPage();
    CartPage cartPage;
    @When("I click on cart button")
    public void IClickOnCartButton(){
        inventoryPage.clickCartIcon();
    }
    @And("I click on continue shopping button")
    public void IClickOnContinueShoppingButton(){
        cartPage.clickContinueButton();
    }

}
