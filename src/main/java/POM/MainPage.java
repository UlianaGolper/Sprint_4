package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private String url = "https://qa-scooter.praktikum-services.ru/";
    private final By cookieButton = By.id("rcc-confirm-button");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openSite() {
        driver.get(url);
        return this;
    }

    public MainPage closeCookies() {
        // закрыть окно с куками
        driver.findElement(cookieButton).click();
        return this;
    }

    public MainPage findQuestion(By question) {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(question).click();
        return this;
    }
}

