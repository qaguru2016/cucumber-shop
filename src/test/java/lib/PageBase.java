package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    protected WebDriver driver;
    private final Duration TIME_OUT = Duration.ofSeconds(5);
    protected void click(By by){
        WebElement we = new WebDriverWait(driver, TIME_OUT )
                .until(ExpectedConditions.elementToBeClickable(by));
        we.click();
    }
    protected void sendKeys(By by,String keys){
        new WebDriverWait(driver, TIME_OUT)
                .until(ExpectedConditions.elementToBeClickable(by))
                .sendKeys(keys);
    }
    protected String getText(By by){
        return new WebDriverWait(driver, TIME_OUT)
                .until(ExpectedConditions.visibilityOfElementLocated(by))
                .getText();
    }

    protected boolean isTextPresent(String text){
        boolean present = true;
        By by = By.xpath("//*[text()='"+text+"']");
        try {
            new WebDriverWait(driver, TIME_OUT)
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }catch (Exception e){
            present = false;
        }
        return present;
    }
//    protected boolean isTextEqual(By by, String text){
//        boolean equal = true;
//        WebElement lblWelcome = driver.findElement(by);
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT));
//        try {
//            wait.until(d -> lblWelcome.getText().equalsIgnoreCase(text));
//        }catch (TimeoutException e){
//            equal = false;
//        }
//        return equal;
//    }

}
