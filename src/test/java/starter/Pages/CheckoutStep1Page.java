package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class CheckoutStep1Page extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By headerTitle = By.cssSelector(".title");
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public String getHeaderTitle(){
        return driver.findElement(headerTitle).getText();
    }
}
