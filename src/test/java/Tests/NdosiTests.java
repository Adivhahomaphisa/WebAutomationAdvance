package Tests;

import Pages.LearningMaterialPage;
import Pages.LoginPage;
import Pages.WebAutomationAdvancePage;
import org.openqa.selenium.Keys;
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
    @Test(dependsOnMethods = "ClickLoginTests")
    public void verifyWelcomeHeadingTests(){
        learningMaterialPage.verifyHeading();
    }
    @Test(dependsOnMethods = "verifyWelcomeHeadingTests")
    public void ClickWebAutomationAdvanceTab() {
        learningMaterialPage.ClickWebAutomationAdvanceTab();
    }
    @Test(dependsOnMethods = "ClickWebAutomationAdvanceTab")
    public void verifyTheInventoryHeaderIsDisplayedTests(){
        webAutomationAdvancePage.verifyTheInventoryHeaderIsDisplayed();
    }
    @Test(dependsOnMethods = "verifyTheInventoryHeaderIsDisplayedTests")
    public void SelectDeviceTypeTests(){
        webAutomationAdvancePage.SelectDeviceType("Phone");
    }
    @Test(dependsOnMethods = "SelectDeviceTypeTests")
    public void SelectBrandNameTests(){
        webAutomationAdvancePage.SelectBrandName("Apple");
    }
    @Test(dependsOnMethods ="SelectBrandNameTests" )
    public void SelectStorageTests(){
        webAutomationAdvancePage.SelectStorage("128GB");
    }
    @Test(dependsOnMethods = "SelectStorageTests")
    public void SelectColourTests(){
        webAutomationAdvancePage.SelectColour("Blue");
    }
    @Test(dependsOnMethods = "SelectColourTests")
    public void SelectQuantityTests(){
        webAutomationAdvancePage.SelectQuantity("2");
    }
    @Test(dependsOnMethods = "SelectQuantityTests")
    public void EnterDeliveryAddress(){
        webAutomationAdvancePage.EnterDeliveryAddress("166 Sefago street");
    }
    @Test(dependsOnMethods = "EnterDeliveryAddress")
    public void ClickNextButton(){
        webAutomationAdvancePage.ClickNextButton();
    }


    @AfterTest
    public void closeBrowser(){
//        driver.quit();
    }
}
