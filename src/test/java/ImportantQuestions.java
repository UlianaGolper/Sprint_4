import ConstantsAndBrowserPaths.BrowserRule;
import POM.MainPage;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

import static ConstantsAndBrowserPaths.Constants.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class ImportantQuestions {
    @Rule
    public BrowserRule browserRule = new BrowserRule();
    private final By question;
    private final By answerLocator;
    private String expectedAnswerText;


    public ImportantQuestions(By question, By answerLocator, String expectedAnswerText) {
        this.question = question;
        this.answerLocator = answerLocator;
        this.expectedAnswerText = expectedAnswerText;


    }

    @Parameterized.Parameters(name = "question = {0}, answerLocator{2}, expectedAnswerText = {3}")
    public static Object[][] Object() {
        return new Object[][]{
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
    public void areQuestionsVisible() {
        MainPage mainPage = new MainPage(browserRule.getDriver());
        mainPage.openSite()
                .closeCookies()
                .findQuestion(question);
        String text = browserRule.getDriver().findElement(answerLocator).getText();
        Assert.assertThat(text, containsString(expectedAnswerText));
    }

    }



