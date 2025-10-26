package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    WebDriver driver;

    @FindBy(id = "nav-btn-overview")
    WebElement homepageTille_id;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyHomepageIsDisplayed(){
        homepageTille_id.isDisplayed();
    }
}