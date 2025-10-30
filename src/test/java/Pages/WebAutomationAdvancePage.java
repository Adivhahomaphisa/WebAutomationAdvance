package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationAdvancePage {
    WebDriver driver;

    @FindBy(id = "inventory-title")
    WebElement InventoryHeader_id;

    @FindBy(id = "deviceType")
    WebElement DeviceType_id;

    @FindBy(id = "brand")
    WebElement BrandName_id;


    public WebAutomationAdvancePage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyTheInventoryHeaderIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(InventoryHeader_id));
        InventoryHeader_id.isDisplayed();
    }
    public void SelectDeviceType(String deviceType){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(DeviceType_id));
        DeviceType_id.sendKeys(deviceType);
    }
    public void SelectBrandName(String BrandName){
        new WebDriverWait(driver ,Duration.ofSeconds(10)).until(visibilityOf(BrandName_id));
        BrandName_id.sendKeys(BrandName);

    }
}
