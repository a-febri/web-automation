package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartPage extends PageObject {
    @Managed
    WebDriver driver=getDriver();

    private final By continueButton = By.id("continue-shopping");
    private final By removeTestAllTheThingsTShirt = By.id("remove-test.allthethings()-t-shirt-(red)");
    private final By checkOutButton = By.id("checkout");

    public void clickRemoveTestAllTheThingsTShirt(){
        driver.findElement(removeTestAllTheThingsTShirt).click();
    }
    public void clickCheckoutButton(){
        driver.findElement(checkOutButton).click();
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    public boolean isRemoveButtonDeleted(){
        return driver.findElements(By.id("remove-test.allthethings()-t-shirt-(red)")).isEmpty();
    }
    public boolean isInventoryNameDeleted(){
       return driver.findElements(By.cssSelector("#item_3_title_link > div:nth-child(1)")).isEmpty();
    }
}
