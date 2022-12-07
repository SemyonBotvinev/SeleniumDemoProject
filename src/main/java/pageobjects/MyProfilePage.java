package pageobjects;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MyProfilePage extends BasePage {
    protected final String URL = "https://dom-kauf.com/ru/my-account";
    protected final String EXPECTED_TITLE = "Моя учетная запись";

    public MyProfilePage(WebDriver driver) {
        this.driver = driver;
        super.url = this.URL;
        super.expectedTitle = this.EXPECTED_TITLE;
    }

    public MyProfilePage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.URL;
            super.expectedTitle= this.EXPECTED_TITLE;
        }
    }


}