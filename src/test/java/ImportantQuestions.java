import ConstantsAndBrowserPaths.BrowsersPaths;
import POM.MainPage;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static ConstantsAndBrowserPaths.Constants.*;
import static ConstantsAndBrowserPaths.Constants.GREY_COLOUR;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ImportantQuestions {
    private final By question;
    private final By answerLocator;
    private String expectedAnswerText;


    public ImportantQuestions(By question, By answerLocator, String expectedAnswerText) {
        this.question = question;
        this.answerLocator = answerLocator;
        this.expectedAnswerText = expectedAnswerText;


    }

    @Parameterized.Parameters (name = "question = {0}, answerLocator{2}, expectedAnswerText = {3}")
    public static Object[][] Object() {
        return new Object[][] {
             {QUESTION_1, LOCATOR_ANSWER_1, TEXT_ANSWER_1},
              {QUESTION_2, LOCATOR_ANSWER_2, TEXT_ANSWER_2},
              {QUESTION_3, LOCATOR_ANSWER_3, TEXT_ANSWER_3},
               {QUESTION_4, LOCATOR_ANSWER_4, TEXT_ANSWER_4},
                {QUESTION_5, LOCATOR_ANSWER_5, TEXT_ANSWER_5},
                {QUESTION_6, LOCATOR_ANSWER_6, TEXT_ANSWER_6},
                {QUESTION_7, LOCATOR_ANSWER_7, TEXT_ANSWER_7},
              {QUESTION_8, LOCATOR_ANSWER_8, TEXT_ANSWER_8},

        };
    }

    @Test
    public void OpenSite() {
       // System.setProperty("webdriver.chrome.driver", BrowsersPaths.ChromeDriverPath);
        //GeckoDriverService gecko = new GeckoDriverService.Builder()
          //    .usingDriverExecutable(new File(BrowsersPaths.FireFoxDriverPath))
            //    .usingFirefoxBinary(new FirefoxBinary(new File(BrowsersPaths.FireFoxBrowserPath)))
              //.build();
        //WebDriver driver = new FirefoxDriver(gecko);
       WebDriver driver = new ChromeDriver();

        MainPage mainPage = new MainPage(driver);
        mainPage.openSite()
                .closeCookies()
                .findQuestion(question);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String text = driver.findElement(answerLocator).getText();
        Assert.assertThat(text, containsString(expectedAnswerText));
        driver.quit();
    }

}
