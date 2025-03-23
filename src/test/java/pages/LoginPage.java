package pages;

import lib.PageBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    //Locators
    private By lnkSignIn = By.linkText("Sign In");
    private By txtEmail = By.name("login[username]");
    private By txtPassword = By.name("login[password]");
    private By btnSignIn = By.id("send2");
    private By lblWelcome = By.className("logged-in");
//    private By lblErrMsg = By.className("messages");
//    private By lblEmailErr = By.id("email-error");
//    private By lblPasswordErr = By.id("pass-error");

    public LoginPage(WebDriver driver) {
        super.driver = driver;
    }

    public void login(String email, String password){
        click(lnkSignIn);
        sendKeys(txtEmail,email);
        sendKeys(txtPassword,password);
        click(btnSignIn);
    }

    public void verifyLogin(String fullName){
        String expMsg = "Welcome, " + fullName + "!";
        Assert.assertTrue("User not logged in" ,isTextPresent(expMsg));

    }

}
