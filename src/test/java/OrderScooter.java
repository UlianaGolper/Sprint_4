import ConstantsAndBrowserPaths.BrowsersPaths;
import POM.FillInFirstPage;
import POM.FillInSecondPage;
import POM.MainPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static ConstantsAndBrowserPaths.Constants.*;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderScooter {
    private final By button;
    private String firstName;
    private String secondName;
    private String address;
    private String metroStation;
    private String phoneNumber;
    private String date;
    private By ScooterColour;
    private By numberOfDays;
    private String comment;


    public OrderScooter(By button, String firstName, String secondName, String address, String metroStation, String phoneNumber, String date, By numberOfDays, By ScooterColour, String comment) {
        this.button = button;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.numberOfDays = numberOfDays;
        this.ScooterColour = ScooterColour;
        this.comment = comment;
    }

    @Parameterized.Parameters (name = "button = {0},firstName = {1}, secondName = {2}, address = {3}, metroStation = {3}, phoneNumber = {4}, date = {5}, numberOfDays = {6}, ScooterColour = {7}")
    public static Object[][] Object() {
        return new Object[][] {
                { UPPER_ORDER_BUTTON,"Мария", "Кошкина", "ул.Котиков 58, кв. 5", "Кропоткинская", "89111234567", "22.11.22", ONE_DAY_RENT, BLACK_COLOUR,"Не звоните в звонок"},
                { LOWER_ORDER_BUTTON,"Кот", "Васильев", "ул.Бубликов 75, кв 90", "Черкизовская", "89120987654", "24.12.22", TWO_DAYS_RENT, GREY_COLOUR, "буду дома с 8 до 21.00"},
        };
    }

        @Test
        public void OpenSite() {
            System.setProperty("webdriver.chrome.driver", BrowsersPaths.ChromeDriverPath);
            GeckoDriverService gecko = new GeckoDriverService.Builder()
                    .usingDriverExecutable(new File(BrowsersPaths.FireFoxDriverPath))
                    .usingFirefoxBinary(new FirefoxBinary(new File(BrowsersPaths.FireFoxBrowserPath)))
                    .build();
            WebDriver driver = new FirefoxDriver(gecko);
            //WebDriver driver = new ChromeDriver();

            MainPage mainPage = new MainPage(driver);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            mainPage.openSite()
                    .closeCookies();

            FillInFirstPage fillInFirstPage = new FillInFirstPage(driver);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            fillInFirstPage.fillInFirstPageTabs(button, firstName, secondName, address, metroStation, phoneNumber);

            FillInSecondPage fillInSecondPage = new FillInSecondPage(driver);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            fillInSecondPage.fillInFirstPageTabs(date, numberOfDays, ScooterColour, comment);

            assertTrue(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button")).isDisplayed());


            driver.quit();
            }
        }

