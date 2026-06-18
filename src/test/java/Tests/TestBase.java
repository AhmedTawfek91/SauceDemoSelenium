package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import static Utils.Environments.*;



public class TestBase extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        // Disable password manager & breach alerts
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("password_manager_enabled", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        System.out.println("Connecting to: " + BASE_URL);
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }
}
