package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps {
    private String baseUrl = "https://magento.softwaretestingboard.com";
    private WebDriver driver;
    private LoginPage loginPage;
    @Given("User is on the Login page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get(baseUrl);
    }
    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        String email = "pradeep.pp@gmail.com";
        String password = "Test#123";
        loginPage.login(email,password);
    }
    @Then("User should be redirected to the Home page")
    public void user_should_be_redirected_to_the_home_page() {
        loginPage.verifyLogin("Automation Tester");
        driver.quit();
    }
}
