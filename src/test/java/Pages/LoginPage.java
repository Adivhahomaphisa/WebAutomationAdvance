package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "login-email")
    WebElement loginEmail_id;

    @FindBy(id = "login-password")
    WebElement LoginPassword_id;

    @FindBy(id = "login-submit")WebElement loginSubmit_id;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void EnterLoginEmail(String email){
       new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginEmail_id));
        loginEmail_id.sendKeys(email);
    }

    public void enterPasswordId(String Password) {
        LoginPassword_id.sendKeys(Password);}

    public void clickLogin(){
        loginSubmit_id.click();}

    }
