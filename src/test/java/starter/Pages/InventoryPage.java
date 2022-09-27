package starter.Pages;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.ibm.icu.text.PluralRules.Operand.j;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();
    private final By cartIcon = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");
    private final By sortingButton = By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select");
    private final By headerTitle = By.cssSelector(".title");
    private final By badgeIcon = By.cssSelector(".shopping_cart_badge");
    private final By removeButton = By.id("remove-sauce-labs-fleece-jacket");
    private final By sortActive = By.cssSelector(".active_option");



    public void clickCartIcon(){
        driver.findElement(cartIcon).click();
    }
    public void clickSortingButton(){
        driver.findElement(sortingButton).click();
    }
    public void selectSortingElement(String data){
        WebElement selectElement = driver.findElement(sortingButton);
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText(data);
    }
    public boolean isCartVisible(){
       return driver.findElement(cartIcon).isDisplayed();
    }
    public String getHeaderTitle(){
        return driver.findElement(headerTitle).getText();
    }
    public boolean isRemoveButtonVisible(){
        return driver.findElement(removeButton).isDisplayed();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void selectItem(String item){
        driver.findElement(By.id(item)).click();
    }
    public boolean isBadgeIconVisible(){
        return driver.findElement(badgeIcon).isDisplayed();
    }
    public boolean isAddtoCartVisible(){
        return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).isDisplayed();
    }
    public String getActiveSort(){
        return driver.findElement(sortActive).getAttribute("innerHTML");
    }
    public boolean checkSortByNameZtoA(){
        ArrayList<String> obtainedList = new ArrayList<>();
        List<WebElement> elementList= driver.findElements(By.className("inventory_item_name"));
        for(WebElement q: elementList){
            obtainedList.add(q.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>(obtainedList);
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        return sortedList.equals(obtainedList);
    }
    public boolean checkSortInventoryNameByDefault(){
        ArrayList<String> obtainedList = new ArrayList<>();
        List<WebElement> elementList= driver.findElements(By.className("inventory_item_name"));
        for(WebElement we: elementList){
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>(obtainedList);
        Collections.sort(sortedList);
        return sortedList.equals(obtainedList);
    }

}
