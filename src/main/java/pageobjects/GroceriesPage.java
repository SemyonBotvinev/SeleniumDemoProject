package pageobjects;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class GroceriesPage extends BasePage {
    protected final String URL = "https://dom-kauf.com/ru/181-produkty";
    protected final String EXPECTED_TITLE = "✅ Купить русские продукты питания в Германии| Dom-kauf ❤️";

    public GroceriesPage(WebDriver driver) {
        this.driver = driver;
        super.url = this.URL;
        super.expectedTitle = this.EXPECTED_TITLE;
    }

    public GroceriesPage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.URL;
            super.expectedTitle= this.EXPECTED_TITLE;
        }
    }


}
