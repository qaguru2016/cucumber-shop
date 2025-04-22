package lib;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepBase {

    protected WebDriver driver;
    protected void launchBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    protected void quitBrowser(){
        driver.quit();
    }

}
