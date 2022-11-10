package selenium;

import org.openqa.selenium.WebDriver;
import pageobjects.HouseAndGardenPage;
import pageobjects.SearchResultsPage;
import static org.openqa.selenium.support.PageFactory.initElements;

public class CommonTests {

    //private WebDriver driver;
    private HouseAndGardenPage houseAndGardenPage;
    private SearchResultsPage searchResultsPage;

    CommonTests(WebDriver driver) {
        //this.driver = driver;
        houseAndGardenPage = initElements(driver, HouseAndGardenPage.class);
        searchResultsPage = initElements(driver, SearchResultsPage.class);
    }

    public void searchTest() {
        houseAndGardenPage.go();
        houseAndGardenPage.putValueIntoSearchField("КАСТРЮЛЯ");
        searchResultsPage.sendEnterIntoSearchField();
        searchResultsPage.clickFirstProductInSearchResults();
    }




}
