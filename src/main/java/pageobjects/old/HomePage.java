package pageobjects.old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

import java.util.List;

import static java.lang.System.getProperty;
import static org.openqa.selenium.support.PageFactory.initElements;
import static org.testng.Assert.assertEquals;

public class HomePage extends BasePage {

    private final String url = "http://automationpractice.com/index.php";
    private final String expectedTitle = "My Store";

    @FindBy(css = "#cart_summary > tbody > tr")
    private List<WebElement> productsList;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        super.url = this.url;
        super.expectedTitle= this.expectedTitle;

    }

    public HomePage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.url;
            super.expectedTitle= this.expectedTitle;
        }
    }

    public void checkProductFirstInCart(String productName) {
        assertEquals(productsList.get(0).findElement(By.cssSelector(".product-name > a")).getText(), productName);
    }

    public void fillSearchField(String query) {
        searchField.sendKeys(query);
    }

    public void clickLoopButton() {
        searchButton.click();
    }

}
