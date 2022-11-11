package selenium;

import org.openqa.selenium.WebDriver;
import pageobjects.SeleniumSettings;

public class BrowserCreator {
    public static WebdriverInterface newChromeDriver = () -> {
        SeleniumSettings settings = new SeleniumSettings();
        WebDriver d = settings.useChrome();
        return d;
    };

    @FunctionalInterface
    interface WebdriverInterface {
        WebDriver create();
    }

}

