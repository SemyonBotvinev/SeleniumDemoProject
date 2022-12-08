package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.awaitility.Durations;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.awaitility.Awaitility.await;

public class BasePage {

    protected WebDriver driver;
    protected String url;
    protected String expectedTitle;

    @FindBy(css = ".ui-autocomplete-input")
    protected WebElement searchField;

    @FindBy(css = ".ui-autocomplete-input ~ button")
    protected WebElement searchButton;

    @FindBy(css = "#jvlabelWrap")
    protected WebElement contactUsButton;

    @FindBy(css = ".product_list .row > div:nth-of-type(1)")
    protected WebElement firstProductInSearchResults;

    @FindBy(css = ".product_list .row > div:nth-of-type(1) .leo-bt-cart-content")
    protected WebElement firstProductInSearchResultsAddToCartButton;

    @FindBy(css = ".inputField_ba74")
    protected WebElement contactUsTextInputArea;

    @FindBy(css = "div.cart-content-btn  a.btn-primary[href=\"//dom-kauf.com/ru/cart?action=show\"]")
    protected WebElement shoppingCartIcon;


    // селектор для ховера
    By firstProduct = By.cssSelector(".product_list .row > div:nth-of-type(1)");

    // метод для ховера на эелемент
    public void moveCursorToElement(By by){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by));
        action.build().perform();
    }

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

    public void addFirstProductInSearchResultsToCart() {
        moveCursorToElement(firstProduct);
        firstProductInSearchResultsAddToCartButton.click();
    }

    public void contactUsButtonClick() {contactUsButton.click(); }

    public void shoppingCartIconClick() {shoppingCartIcon.click();}

    public void sendKeysToContactUsTextInputArea(String keys) {contactUsTextInputArea.sendKeys(keys);}

    public static void sleep(int seconds) {
        await().forever().pollDelay(Duration.ofSeconds(seconds)).until(() -> true);
    }
    
}
