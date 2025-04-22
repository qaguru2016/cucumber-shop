package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;
    private static String baseUrl = "https://magento.softwaretestingboard.com";

    // Singleton method to get the driver instance
    public static WebDriver getDriver() {
        if (driver == null) {
//            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();

        }
        return driver;
    }

    // Close the driver instance
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}