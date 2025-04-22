//package hooks;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import lib.DriverFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Hooks {
//
//    private String baseUrl = "https://magento.softwaretestingboard.com";
//    @Before
//    public void setup(Scenario scenario) {
//        System.out.println("Starting Scenario: " + scenario.getName());
//        WebDriver driver = DriverFactory.getDriver();
//        driver.manage().window().maximize();
//        driver.get(baseUrl);
//    }
//    @After
//    public void tearDown() {
//        DriverFactory.quitDriver();
//        System.out.println("Browser closed after scenario execution.");
//    }
//}