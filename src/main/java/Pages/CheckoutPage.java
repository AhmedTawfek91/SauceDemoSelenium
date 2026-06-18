package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends PageBase{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By continueBtn = By.id("continue");

    public void fillFirstNameField(String FN)
    {
        waitForVisibility(firstNameField);
        driver.findElement(firstNameField).sendKeys(FN);
    }

    public void fillLastNameField(String LN)
    {
        waitForVisibility(lastNameField);
        driver.findElement(lastNameField).sendKeys(LN);
    }

    public void fillPostalCodeField(String PC)
    {
        waitForVisibility(postalCodeField);
        driver.findElement(postalCodeField).sendKeys(PC);
    }

    public void clickContinueBtn()
    {
        waitForVisibility(continueBtn);
        driver.findElement(continueBtn).click();
    }
}
