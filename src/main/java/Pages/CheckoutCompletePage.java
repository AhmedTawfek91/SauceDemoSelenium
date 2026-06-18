package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends PageBase{
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    By completeMessageHeader = By.className("complete-header");
    By completeMessageText = By.className("complete-text");
    By backHomeBtn = By.id("back-to-products");

    public String getCompleteMessageHeader()
    {
        waitForVisibility(completeMessageHeader);
        return driver.findElement(completeMessageHeader).getText();
    }

    public String getCompleteMessageText()
    {
        waitForVisibility(completeMessageText);
        return driver.findElement(completeMessageText).getText();
    }

    public void clickBackHomeBtn()
    {
        waitForVisibility(backHomeBtn);
        driver.findElement(backHomeBtn).click();
    }
}
