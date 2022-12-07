package pageobjects;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ShoesAndClothesPage extends BasePage {
    protected final String URL = "https://dom-kauf.com/ru/128-odezhda-obuv-i-aksessuary";
    protected final String EXPECTED_TITLE = "✅ Купить одежда, обувь и аксессуары в Германии| Dom-kauf ❤️";

    public ShoesAndClothesPage(WebDriver driver) {
        this.driver = driver;
        super.url = this.URL;
        super.expectedTitle = this.EXPECTED_TITLE;
    }

    public ShoesAndClothesPage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.URL;
            super.expectedTitle= this.EXPECTED_TITLE;
        }
    }


}
