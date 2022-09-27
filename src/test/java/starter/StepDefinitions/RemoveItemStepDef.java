package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;

public class RemoveItemStepDef {
    InventoryPage inventoryPage=new InventoryPage();
    CartPage cartPage=new CartPage();
    @When("I add more product to cart {string}")
    public void IAddMoreProductToCart(String addingProd){
        inventoryPage.selectItem(addingProd);
    }
    @And("I click cart icon")
    public void IClickCartIcon(){
        inventoryPage.clickCartIcon();

    }
    @And("I click remove button")
    public void IClickRemoveButton(){
        cartPage.clickRemoveTestAllTheThingsTShirt();
    }
    @Then("The last added product will be disappear on the cart page")
    public void TheLasProductWillBeDisappearOnTheCartPage(){
        assertTrue(cartPage.isRemoveButtonDeleted());
        assertTrue(cartPage.isInventoryNameDeleted());
        cartPage.clickContinueButton(); //kembali ke halaman awal untuk cek tombol add to cart muncul
        assertTrue(inventoryPage.isAddtoCartVisible()); //cek tombol add to cart
    }
}
