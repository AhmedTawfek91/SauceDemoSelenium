package StepDefinitions;

import Pages.CheckoutPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Utils.Generators.*;
import static Utils.Utils.*;
import java.util.Objects;

public class CheckoutTest extends TestBase {

    CheckoutPage checkoutPage;

    @When("User fill mandatory field and click continue")
    public void Click_Checkout_POSITIVE()
    {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillFirstNameField(FIRST_NAME_GENERATOR);
        checkoutPage.fillLastNameField(LAST_NAME_GENERATOR);
        checkoutPage.fillPostalCodeField(SHORT_CODE_GENERATOR);
        checkoutPage.clickContinueBtn();
    }

    @Then("User navigate to payment details screen")
    public void ASSERT_Navigation_To_PaymentDetails()
    {
        softAssert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("checkout-step-two"));
    }
}
