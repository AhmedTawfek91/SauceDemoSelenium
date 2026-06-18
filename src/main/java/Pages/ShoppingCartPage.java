package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends PageBase{
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    By checkoutBtn = By.id("checkout");

    public void clickCheckout()
    {
        waitForVisibility(checkoutBtn);
        driver.findElement(checkoutBtn).click();
    }
}
