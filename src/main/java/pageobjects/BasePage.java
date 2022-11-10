package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class BasePage {

    protected WebDriver driver;
    protected String url = "";
    protected String expectedTitle;

    @FindBy(css = ".ui-autocomplete-input")
    protected WebElement searchField;

    @FindBy(css = ".ui-autocomplete-input ~ button")
    protected WebElement searchButton;

    @FindBy(css = ".hoverl_fac0")
    protected WebElement contactUsButton;

    @FindBy(css = ".product_list .row > div:nth-of-type(1)")
    protected WebElement firstProductInSearchResults;


    //метод для проверки перехода на нужную страницу (по заголовку)
    public void checkTitle() {
        var actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
    }

    public void go() {
        driver.get(url);
        checkTitle();
    }

    public void putValueIntoSearchField(String value) {
        searchField.sendKeys(value);
    }

    public void sendEnterIntoSearchField() {
        searchField.sendKeys(Keys.RETURN);
    }

    public void clickFirstProductInSearchResults() {
        firstProductInSearchResults.click();
    }

    public void contactUsButtonClick() {
        contactUsButton.click();
    }
    
}
