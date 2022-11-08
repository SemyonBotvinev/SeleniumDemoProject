package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SearchResultsPage extends BasePage {

    protected String url = "https://dom-kauf.com/ru/search?controller=search&s=%D0%BA%D0%B0%D1%81%D1%82%D1%80%D1%8E%D0%BB%D1%8F";
    protected String expectedTitle = "Поиск";

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        super.url = this.url;
        super.expectedTitle= this.expectedTitle;

    }

    public SearchResultsPage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.url;
            super.expectedTitle= this.expectedTitle;
        }
    }

}
