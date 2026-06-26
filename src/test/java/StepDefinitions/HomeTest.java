package StepDefinitions;

import Pages.HomePage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Utils.Utils.*;

import java.util.Objects;

public class HomeTest extends TestBase {

    HomePage homePage;

    @When("User click at add to cart button for products")
    public void Add_Products_TO_Cart_POSITIVE()
    {
        homePage = new HomePage(driver);
        String homeScreenLogo = homePage.getHomeScreenLogo();
        System.out.println("Home Screen Logo is: " + homeScreenLogo);
        homePage.clickSauceLabsBackPackProduct();
        homePage.clickSauceLabsBikeLightProduct();
    }

    @Then("Products added to cart successfully")
    public void ASSERT_Products_Added_TO_Cart()
    {
        String noOfProducts = homePage.getCartNoOfAddedProducts();
        softAssert.assertEquals(noOfProducts, 2);
    }

    @When("User click on the cart button")
    public void Click_Cart_Button_POSITIVE()
    {
        homePage = new HomePage(driver);
        homePage.clickCartBtn();
    }

    @Then("User navigate to the shopping cart screen successfully")
    public void ASSERT_Navigation_To_ShoppingCart()
    {
        softAssert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("cart"));
    }

    @When("User click on the logout button")
    public void Click_Logout_POSITIVE()
    {
        homePage = new HomePage(driver);
        homePage.clickSideMenuBtn();
        homePage.clickLogoutBtn();
    }

}
