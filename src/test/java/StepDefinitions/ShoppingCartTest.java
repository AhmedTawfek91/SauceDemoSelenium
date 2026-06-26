package StepDefinitions;

import Pages.ShoppingCartPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Utils.Utils.*;

import java.util.Objects;

public class ShoppingCartTest extends TestBase {

    ShoppingCartPage shoppingCartPage;

    @When("User click on checkout button")
    public void Click_Checkout_POSITIVE()
    {
        shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickCheckout();
    }

    @Then("User navigate to checkout screen successfully")
    public void ASSERT_Navigation_TO_CheckoutScreen()
    {
        softAssert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("checkout-step-one"));
    }
}
