package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CheckoutPage extends BasePage {
    protected final String URL = "https://dom-kauf.com/ru/module/klarnaofficial/checkoutklarnakco";
    protected final String EXPECTED_TITLE = "Dom Kauf";

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        super.url = this.URL;
        super.expectedTitle = this.EXPECTED_TITLE;
    }

    public CheckoutPage(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.URL;
            super.expectedTitle= this.EXPECTED_TITLE;
        }
    }

    @FindBy(css = "a.remove-from-cart[href^=\"https://dom-kauf.com/ru/cart?delete\"]")
    protected WebElement removeFromCartIcon;

    public void removeFromCartIconClick() {removeFromCartIcon.click();
    }

}
