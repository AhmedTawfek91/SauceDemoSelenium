package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By homeScreenLogo = By.xpath("//div[text()='Swag Labs']");
    By sauceLabsBackPackProduct = By.id("add-to-cart-sauce-labs-backpack");
    By sauceLabsBikeLightProduct = By.id("add-to-cart-sauce-labs-bike-light");
    By cartNoOfAddedProducts = By.className("shopping_cart_badge");
    By cartBtn = By.className("shopping_cart_link");

    public String getHomeScreenLogo()
    {
        waitForVisibility(homeScreenLogo);
        return driver.findElement(homeScreenLogo).getText();
    }

    public void clickSauceLabsBackPackProduct()
    {
        waitForVisibility(sauceLabsBackPackProduct);
        driver.findElement(sauceLabsBackPackProduct).click();
    }

    public void clickSauceLabsBikeLightProduct()
    {
        waitForVisibility(sauceLabsBikeLightProduct);
        driver.findElement(sauceLabsBikeLightProduct).click();
    }

    public String getCartNoOfAddedProducts()
    {
        waitForVisibility(cartNoOfAddedProducts);
        return driver.findElement(cartNoOfAddedProducts).getText();
    }

    public void clickCartBtn()
    {
        waitForVisibility(cartBtn);
        driver.findElement(cartBtn).click();
    }
}
