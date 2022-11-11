package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.SeleniumSettings;

import static org.openqa.selenium.support.PageFactory.initElements;

public class FirefoxTest {

    private SeleniumSettings settings = new SeleniumSettings();
    private WebDriver driver;

    @BeforeMethod
    void beforeMethod() {
        var driver = settings.useFirefox();
        this.driver = driver;
    }

    @Test
    void run() {
        var commonTests = new CommonTests(driver);
        commonTests.searchTest();
        driver.close();
    }


}
