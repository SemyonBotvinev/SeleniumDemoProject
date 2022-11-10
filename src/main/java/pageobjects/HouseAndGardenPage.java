package pageobjects;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class HouseAndGardenPage extends BasePage {
    protected String URL = "https://dom-kauf.com/ru/37-dom-i-dacha";
    protected final String EXPECTED_TITLE = "✅ Купить товары для дома и дачи в Германии| Dom-kauf ❤️";

    public HouseAndGardenPage(WebDriver driver) {
        this.driver = driver;
        super.url = this.URL;
        super.expectedTitle = this.EXPECTED_TITLE;
    }

    public HouseAndGardenPage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.URL;
            super.expectedTitle= this.EXPECTED_TITLE;
        }
    }


}
