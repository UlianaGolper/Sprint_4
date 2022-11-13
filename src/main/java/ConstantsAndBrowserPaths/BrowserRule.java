package ConstantsAndBrowserPaths;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BrowserRule extends ExternalResource {
    private WebDriver driver;
   //public static final String FIREFOX_DRIVER_PATH = "C:/Users/79114/WebDriver/bingeck/geckodriver.exe";
    //public static final String FIREFOX_DRIVER_DRIVER = "C:/Program Files/Mozilla Firefox/firefox.exe";
    public WebDriver getDriver() {
        return driver;
    }

    @Override
    protected void before() throws Throwable {
        //System.getProperty("webdriver.CHROME_DRIVER");
        //driver = new ChromeDriver();

        System.out.println(System.getProperty("FIREFOX_DRIVER"));
        System.out.println(System.getProperty("FIREFOX_EXE"));
 GeckoDriverService gecko = new GeckoDriverService.Builder()
   .usingDriverExecutable(new File(System.getProperty("FIREFOX_DRIVER")))
     .usingFirefoxBinary(new FirefoxBinary(new File(System.getProperty("FIREFOX_EXE"))))
         .build();
    driver = new FirefoxDriver(gecko);
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println(System.getProperty("FIREFOX_EXE"));
    }

    @Override
    protected void after() {
       driver.quit();
    }
}
