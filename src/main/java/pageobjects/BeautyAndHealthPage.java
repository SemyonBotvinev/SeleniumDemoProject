package pageobjects;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BeautyAndHealthPage extends BasePage {
    protected final String URL = "https://dom-kauf.com/ru/80-krasota-i-zdorove";
    protected final String EXPECTED_TITLE = "✅ Купить товары для красоты и здоровья в Германии| Dom-kauf ❤️";

    public BeautyAndHealthPage(WebDriver driver) {
        this.driver = driver;
        super.url = this.URL;
        super.expectedTitle = this.EXPECTED_TITLE;
    }

    public BeautyAndHealthPage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.URL;
            super.expectedTitle= this.EXPECTED_TITLE;
        }
    }


}
