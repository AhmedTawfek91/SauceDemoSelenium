package StepDefinitions;

import Pages.PaymentDetailsPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Objects;

import static Utils.Utils.*;

public class PaymentDetailsTest extends TestBase {

    PaymentDetailsPage paymentDetailsPage;

    @When("User click on the finish button")
    public void Click_Finish_Btn_Positive()
    {
        paymentDetailsPage = new PaymentDetailsPage(driver);
        paymentDetailsPage.clickFinishBtn();
    }

    @Then("User navigate to checkout complete screen successfully")
    public void ASSERT_Navigation_To_Checkout_Complete()
    {
        softAssert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("checkout-complete"));
    }
}
