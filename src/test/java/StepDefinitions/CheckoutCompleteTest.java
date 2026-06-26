package StepDefinitions;

import Pages.CheckoutCompletePage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Utils.Utils.*;

import java.util.Objects;

public class CheckoutCompleteTest extends TestBase {

    CheckoutCompletePage checkoutCompletePage;

    @When("User click on back home button")
    public void Click_BackHome_Btn_POSITIVE() {
        checkoutCompletePage = new CheckoutCompletePage(driver);
        checkoutCompletePage.captureScreenShot();
        String checkoutCompleteHeader = checkoutCompletePage.getCompleteMessageHeader();
        System.out.println(checkoutCompleteHeader);
        String checkoutCompleteText = checkoutCompletePage.getCompleteMessageText();
        System.out.println(checkoutCompleteText);
        checkoutCompletePage.clickBackHomeBtn();
    }

    @Then("User navigate to home screen successfully")
    public void ASSERT_Navigation_To_HomeScreen() {
        softAssert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("inventory"));

    }
}
