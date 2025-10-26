package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "login-email")
    WebElement loginEmail_id;

    @FindBy(id = "login-password")
    WebElement LoginPassword_id;

    @FindBy(id = " login-submit")WebElement loginSubmit_id;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void EnterLoginEmail(){loginEmail_id.sendKeys("Adivhaho.Maphisa@gmail.com");}
    public void enterPasswordId(){LoginPassword_id.sendKeys("Adivhaho");}
    public void clickLogin(){loginSubmit_id.click();}

    }
}
