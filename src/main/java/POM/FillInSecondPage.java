package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class FillInSecondPage {
    private WebDriver driver;

    private By dateField = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div/input");

    private By durationField = (By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]"));

    private By commentField = By.cssSelector(".Input_InputContainer__3NykH > .Input_Responsible__1jDKN");
    private By finalOrderButton = By.cssSelector(".Order_Buttons__1xGrp");

    private By confirmationButton = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");

    private By orderInfo = By.cssSelector(".Order_ModalHeader__3FDaJ");
    private By trackingButton = By.cssSelector(".Order_ModalHeader__3FDaJ");

    public FillInSecondPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInFirstPageTabs(String date,By numberOfDays,By ScooterColour, String comment){
    driver.findElement(dateField).sendKeys(date, Keys.ENTER);
            driver.findElement(durationField).click();
            driver.findElement(numberOfDays).click();
            driver.findElement(ScooterColour).click();
            driver.findElement(commentField).sendKeys(comment);
            driver.findElement(confirmationButton).click();
            driver.findElement(trackingButton).click();

    }}







