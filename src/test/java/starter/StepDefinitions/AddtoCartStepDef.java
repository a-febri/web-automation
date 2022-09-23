package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;

import static org.junit.Assert.assertTrue;

public class AddtoCartStepDef {
    InventoryPage inventoryPage;
    @When("I select an item {string}")
    public void ISelectAnItem(String item){
        inventoryPage.selectItem(item);
    }

    @Then("Selected item added to cart")
    public void SelectedItemAddedToCart(){
        assertTrue(inventoryPage.isRemoveButtonVisible());
        assertTrue(inventoryPage.isBadgeIconVisible());
    }

    @And("I already added a product to cart {string}")
    public void IAlreadyAddedAProducttoCart(String item){
        inventoryPage.selectItem(item);
    }
}
