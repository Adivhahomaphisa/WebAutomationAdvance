package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

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
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(homepageTitle_id));
        homepageTitle_id.isDisplayed();
    }
    public void ClickLearningMaterial() {
        LearningMaterial_id.click();
    }

}
