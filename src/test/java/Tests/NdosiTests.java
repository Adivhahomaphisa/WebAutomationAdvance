package Tests;

import Pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class NdosiTests extends Base{
    @Test
    public void verifyHomepageIsDisplayedTests(){
        homePage.verifyHomepageIsDisplayed();
    }
    @Test(dependsOnMethods = "verifyHomepageIsDisplayedTests")
    public void ClickLearningMaterialTests(){
        homePage.ClickLearningMaterial();
    }
    @Test(dependsOnMethods ="ClickLearningMaterialTests" )
    public void EnterLoginEmailTests(){
        loginPage.EnterLoginEmail("Adivhaho.Maphisa@gmail.com");
    }
    @Test(dependsOnMethods = "EnterLoginEmailTests")
    public void enterPasswordId() {
        loginPage.enterPasswordId("Adivhaho");
    }
    @Test(dependsOnMethods = "enterPasswordId")
    public void ClickLoginTests(){
        loginPage.clickLogin();
    }
    @AfterTest
    public void closeBrowser(){
//        driver.quit();
    }
}
