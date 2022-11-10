package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.SeleniumSettings;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ChromeTest {

    private SeleniumSettings settings = new SeleniumSettings();
    private WebDriver driver;
    CommonTests test;

    @BeforeMethod
    void beforeMethod() {
        var driver = settings.useChrome();
        this.driver = driver;
        test = new CommonTests(driver);
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }


    @Test
    void firstTest () {
        test.searchTest();
    }

    @Test
    void secondTest () {
        test.searchTest();
    }

    @Test
    void thirdTest () {
        test.searchTest();
    }


}
