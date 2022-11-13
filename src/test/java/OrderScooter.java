import ConstantsAndBrowserPaths.BrowserRule;
import POM.FillInFirstPage;
import POM.FillInSecondPage;
import POM.MainPage;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

import static ConstantsAndBrowserPaths.Constants.*;
import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class OrderScooter {
    @Rule
    public BrowserRule browserRule = new BrowserRule();
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
        public void openSite() {

            MainPage mainPage = new MainPage(browserRule.getDriver());
            mainPage.openSite()
                    .closeCookies();

            FillInFirstPage fillInFirstPage = new FillInFirstPage(browserRule.getDriver());
            fillInFirstPage.fillInFirstPageTabs(button, firstName, secondName, address, metroStation, phoneNumber);

            FillInSecondPage fillInSecondPage = new FillInSecondPage(browserRule.getDriver());
            fillInSecondPage.fillInSecondPageTabs(date, numberOfDays, ScooterColour, comment);
            assertTrue(fillInSecondPage.findTrackingButton().isDisplayed());

            }


}

