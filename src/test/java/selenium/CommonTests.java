package selenium;

import org.openqa.selenium.WebDriver;
import pageobjects.HouseAndGardenPage;
import pageobjects.SearchResultsPage;
import static org.openqa.selenium.support.PageFactory.initElements;

public class CommonTests {

    //private WebDriver driver;   - фактически, классу CommonTests драйвер не нужен. Читай след коммент.
    private HouseAndGardenPage houseAndGardenPage;
    private SearchResultsPage searchResultsPage;


    // здесь (в CommonTests-инстансе) один раз собираются экземпляры всех страниц и передаются в BeforeMethod,
    // шобы каждый тест мог независимо брать их. driver передаётся для использования селениум() уже на самих страницах
    CommonTests(WebDriver driver) {
        //this.driver = driver;
        houseAndGardenPage = initElements(driver, HouseAndGardenPage.class);
        searchResultsPage = initElements(driver, SearchResultsPage.class);
    }


    // релизация тестовых методов; используется в разных тестовых сьютах/классах, но здесь не запускается.
    public void searchTest() {
        houseAndGardenPage.go();
        houseAndGardenPage.putValueIntoSearchField("КАСТРЮЛЯ");
        searchResultsPage.sendEnterIntoSearchField();
        searchResultsPage.clickFirstProductInSearchResults();
        searchResultsPage.sleep(5);
    }

    public void contactUsTest() {
        houseAndGardenPage.go();
        houseAndGardenPage.contactUsButtonClick();
        houseAndGardenPage.sendKeysToContactUsTextInputArea("Привет!");
        houseAndGardenPage.sleep(5);
    }

    public void addToCartTest() {
        houseAndGardenPage.go();
        houseAndGardenPage.putValueIntoSearchField("КАСТРЮЛЯ");
        searchResultsPage.sendEnterIntoSearchField();
        searchResultsPage.addFirstProductInSearchResultsToCart();
        houseAndGardenPage.sleep(5);
    }

}
