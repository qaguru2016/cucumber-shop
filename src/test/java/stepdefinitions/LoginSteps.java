package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lib.DriverFactory;
import lib.StepBase;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps extends StepBase {
    private String baseUrl = "https://magento.softwaretestingboard.com";
    @Before
    public void setup(Scenario scenario) {
        System.out.println("Starting Scenario: " + scenario.getName());
        launchBrowser();
        driver.get(baseUrl);
    }
    @After
    public void tearDown() {
        quitBrowser();
        System.out.println("Browser closed after scenario execution.");
    }


    private LoginPage loginPage;
    @When("User logins with valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
//        WebDriver driver = DriverFactory.getDriver();
//        super.driver.get(baseUrl);
        loginPage = new LoginPage(driver);
        loginPage.login(username,password);
    }
    @Then("User should be redirected to the Home page")
    public void user_should_be_redirected_to_the_home_page() {
        loginPage.verifyLogin("Automation Tester");

    }
}
