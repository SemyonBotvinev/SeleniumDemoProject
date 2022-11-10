package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageobjects.SeleniumSettings;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ChromeTest {

    private SeleniumSettings settings = new SeleniumSettings();
    private WebDriver driver;
    private WebDriver driver2;
    CommonTests test;


    @BeforeMethod
    void beforeMethod() throws InterruptedException {
        this.driver = settings.useChrome();
        test = new CommonTests(this.driver);
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
    void thirdTest ()  {
        test.searchTest();
    }


}
