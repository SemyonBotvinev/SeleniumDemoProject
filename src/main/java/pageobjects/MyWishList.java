package pageobjects;

import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MyWishList extends BasePage {
    protected final String URL = "https://dom-kauf.com/ru/module/leofeature/mywishlist";
    protected final String EXPECTED_TITLE = "Dom Kauf - My Wishlist";

    public MyWishList(WebDriver driver) {
        this.driver = driver;
        super.url = this.URL;
        super.expectedTitle = this.EXPECTED_TITLE;
    }

    public MyWishList(WebDriver driver, boolean withPageFactory) {
        this.driver = driver;

        if(withPageFactory) {
            initElements(driver, this);
            super.url = this.URL;
            super.expectedTitle= this.EXPECTED_TITLE;
        }
    }


}