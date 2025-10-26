package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    WebDriver driver;

    @FindBy(id = "nav-btn-overview")
    WebElement homepageTitle_id;

    @FindBy(id = "nav-btn-practice")
    WebElement LearningMaterial_id;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyHomepageIsDisplayed(){
        homepageTitle_id.isDisplayed();
    }
    public void verifyLearningMaterial() {
        LearningMaterial_id.click();
    }

}
