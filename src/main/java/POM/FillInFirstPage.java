package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertNotNull;

public class FillInFirstPage {

        private WebDriver driver;
        //поле ввода имени
        private By nameField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(1) > .Input_Responsible__1jDKN");
        //поле ввода фамилии
        private By secondNameField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(2) > .Input_Input__1iN_Z");
        //поле ввода адреса
        private By addressField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(3) > .Input_Input__1iN_Z");
        //выбор станции метро
        private By metroField = By.cssSelector(".select-search__input");
       //поле ввода номера телефона
        private By phoneField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(5) > .Input_Input__1iN_Z");
        //кнопка "Далее"
        private By moveOnButton = By.cssSelector(".Button_Middle__1CSJM");


        public FillInFirstPage (WebDriver driver) {
            this.driver = driver;
        }
    //заполнить все поля первой страницы
    public void fillInFirstPageTabs(By button, String firstName, String secondName, String address, String metroStation, String phoneNumber) {driver.findElement(button).click();
        driver.findElement(nameField).sendKeys(firstName);
        driver.findElement(secondNameField).sendKeys(secondName);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(metroField).click();
        driver.findElement(metroField).sendKeys(metroStation, Keys.ARROW_DOWN, Keys.ENTER);
        driver.findElement(phoneField).sendKeys(phoneNumber);
        driver.findElement(moveOnButton).click();
    }
}

