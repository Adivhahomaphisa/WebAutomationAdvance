package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver StartBrowser(String BrowserChoice, String url) {
        if (BrowserChoice.equalsIgnoreCase("Chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver();
        } else if (BrowserChoice.equalsIgnoreCase("internet Explorer")) {
            driver = new InternetExplorerDriver();
        } else if (BrowserChoice.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (BrowserChoice.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    @Test
    public void test() {
        StartBrowser("internetexplorer","https://www.ndosiautomation.co.za/");
    }
}
