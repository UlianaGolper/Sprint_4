package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FillInSecondPage {
    private WebDriver driver;

    //поле выбора даты
    private By dateField = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div/input");
 //поле выбора срока аренды
    private By durationField = (By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]"));
    //поле ввода комментария
    private By commentField = By.cssSelector(".Input_InputContainer__3NykH > .Input_Responsible__1jDKN");
    //кнопка "Заказать"
    private By finalOrderButton = By.cssSelector(".Order_Buttons__1xGrp");
    //кнопка подтверждения заказа - ДА
    private By confirmationButton = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");
    //высплывающее окно информации о заказе
    private By orderInfo = By.cssSelector(".Order_ModalHeader__3FDaJ");
    //кнопка "отследить заказ"
    public By trackingButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button");

    //заполнить вторую страницу заказа
    public FillInSecondPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInSecondPageTabs(String date,By numberOfDays,By ScooterColour, String comment){
    driver.findElement(dateField).sendKeys(date, Keys.ENTER);
            driver.findElement(durationField).click();
            driver.findElement(numberOfDays).click();
            driver.findElement(ScooterColour).click();
            driver.findElement(commentField).sendKeys(comment);
            driver.findElement(confirmationButton).click();
    }
public WebElement findTrackingButton (){
        driver.findElement(trackingButton);
        return driver.findElement(trackingButton);
}
}







