package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentDetailsPage extends PageBase{
    public PaymentDetailsPage(WebDriver driver) {
        super(driver);
    }

    By finishBtn = By.id("finish");

    public void clickFinishBtn()
    {
        waitForVisibility(finishBtn);
        driver.findElement(finishBtn).click();
    }
}
