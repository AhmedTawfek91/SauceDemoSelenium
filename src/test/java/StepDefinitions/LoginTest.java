package StepDefinitions;

import Pages.LoginPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;
import java.util.Objects;

import static Utils.Utils.*;

import static Utils.Environments.*;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    @When("User insert the login credentials and press login")
    public void Login_POSITIVE() {
        loginPage = new LoginPage(driver);
        loginPage.fillUserNameField(LOGIN_USER_NAME);
        loginPage.fillPasswordField(LOGIN_PASSWORD);
        loginPage.clickLoginBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("User login to home screen")
    public void ASSERT_Login_Home_Screen() {
        softAssert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("inventory"));
    }
}
