package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HouseAndGardenPage;
import pageobjects.SearchResultsPage;

import java.time.Duration;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BaseTest {

    private WebDriver driver;
    private HouseAndGardenPage houseAndGardenPage;
    private SearchResultsPage searchResultsPage;

    @BeforeMethod
    void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        houseAndGardenPage = initElements(driver, HouseAndGardenPage.class);
        searchResultsPage = initElements(driver, SearchResultsPage.class);

    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    void searchCheck() {
        houseAndGardenPage.go();
        houseAndGardenPage.putValueIntoSearchField("КАСТРЮЛЯ");
        searchResultsPage.clickFirstProductInSearchResults();
    }


//    @Test
//    void buyItemCheck() {
//        homePage.go(); //добавляем первый товар "Printed Chiffon Dress"
//        homePage.putIntoSearch("Printed Chiffon Dress");
//        searchPage.addProductByPosition(1);
//
//        homePage.go(); //добавляем второй товар "Blouse"
//        homePage.putIntoSearch("Blouse");
//        searchPage.addProductByPosition(1);
//        searchPage.proceedToCheckoutButtonClick();
//        //productPage.clickProceedToCheckoutButton();
//
//        orderPage.totalCheck(); //делаем проверку отображаемой суммы
//    }
//
//
//    //Тест с использованием .properties + отправка локального файла
//    @Test
//    void contactUsCheck() {
//        homePage.go();
//        homePage.contactUsButtonClick();
//        contactUsPage.addFile();
//        contactUsPage.addMessage();
//        contactUsPage.clickSendButton();
//    }

}
