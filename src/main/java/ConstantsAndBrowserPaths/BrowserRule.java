package ConstantsAndBrowserPaths;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BrowserRule extends ExternalResource {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Override
    protected void before() throws Throwable {
        //System.getProperty("webdriver.CHROME_DRIVER");
        //driver = new ChromeDriver();
        GeckoDriverService service = new GeckoDriverService.Builder()
                .usingDriverExecutable(new File(System.getenv("FIREFOX_DRIVER")))
                .usingFirefoxBinary(new FirefoxBinary(new File(System.getenv("FIREFOX_EXE"))))
                .build();
        driver = new FirefoxDriver(service);

    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Override
    protected void after() {
       driver.quit();
    }
}
