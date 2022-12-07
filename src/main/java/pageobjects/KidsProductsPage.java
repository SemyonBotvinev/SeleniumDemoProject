package pageobjects;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class KidsProductsPage extends BasePage {
    protected final String URL = "https://dom-kauf.com/ru/15-detskie-tovary";
    protected final String EXPECTED_TITLE = "✅ Купить детские товары в Германии| Dom-kauf ❤️";

    public KidsProductsPage(WebDriver driver) {
        this.driver = driver;
        super.url = this.URL;
        super.expectedTitle = this.EXPECTED_TITLE;
    }

    public KidsProductsPage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.URL;
            super.expectedTitle= this.EXPECTED_TITLE;
        }
    }


}
