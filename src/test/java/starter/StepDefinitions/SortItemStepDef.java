package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;

import static org.junit.Assert.assertEquals;


public class SortItemStepDef {
    InventoryPage inventoryPage= new InventoryPage();
    @When("I click sorting field")
    public void IClickSortingField(){
        inventoryPage.clickSortingButton();
    }

    @And("I select {string}")
    public void ISelectDropdown(String data) {
        inventoryPage.selectSortingElement(data);
    }
    @Then("Product should be sorted by {string}")
    public void ProductShouldBeSortedBy(String string){
        assertEquals(string,inventoryPage.getActiveSort());
        inventoryPage.checkSortByNameZtoA();
    }
}
