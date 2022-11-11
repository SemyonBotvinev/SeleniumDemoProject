package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ChromeTest {
    BrowserCreator.WebdriverInterface chrome = BrowserCreator.newChromeDriver;
        //если бы был общее поле test - мы могли бы его послать в создание лямбды, и там он уже будет
        //залинкован к именно запущенному драйверу

    @Test
    void firstTest () {
        var driver = chrome.create();
        var test = new CommonTests(driver);
        test.searchTest();
        driver.close();
    }

    @Test
    void secondTest () {
        WebDriver driver = chrome.create();
        var test = new CommonTests(driver);
        test.searchTest();
        driver.close();
    }
    @Test
    void thirdTest ()  {
        WebDriver driver = chrome.create();
        var test = new CommonTests(driver);
        test.searchTest();
        driver.close();
    }


}
