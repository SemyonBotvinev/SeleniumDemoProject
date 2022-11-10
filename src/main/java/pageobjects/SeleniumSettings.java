package pageobjects;
// класс, который будет использоваться в настройках прогонов
//какие браузеры, сколько прогонов, паралеллизация и вот это всё.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;


import static org.openqa.selenium.support.PageFactory.initElements;

public class SeleniumSettings {
    private WebDriver driver;

    public WebDriver useChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver useFirefox() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        return driver;
    }


}
