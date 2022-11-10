package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class HouseAndGardenPage extends BasePage {

    protected String url = "https://dom-kauf.com/ru/37-dom-i-dacha";
    protected String expectedTitle = "✅ Купить товары для дома и дачи в Германии| Dom-kauf ❤️";

    public HouseAndGardenPage(WebDriver driver) {
        this.driver = driver;
        super.url = this.url;
        super.expectedTitle= this.expectedTitle;


    }

    public HouseAndGardenPage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.url;
            super.expectedTitle= this.expectedTitle;
        }
    }


}
