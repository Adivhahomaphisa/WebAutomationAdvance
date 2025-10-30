package Pages;

import org.openqa.selenium.Keys;
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

    @FindBy(id = "storage-128GB")
    WebElement Storage_id;

    @FindBy(id = "color")
    WebElement SelectColour_id;

    @FindBy(id = "quantity")
    WebElement SelectQuantity_id;

    @FindBy(id = "address")
    WebElement EnterDeliveryAddress_id;

    @FindBy(id = "inventory-next-btn")
    WebElement ClickNextButton_id;

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
    public void SelectStorage(String Storage){
        new WebDriverWait(driver ,Duration.ofSeconds(10)).until(visibilityOf(Storage_id));
        Storage_id.sendKeys(Storage);
    }
    public void SelectColour(String Colour){
        new WebDriverWait(driver , Duration.ofSeconds(10)).until(visibilityOf(SelectColour_id));
        SelectColour_id.sendKeys(Colour);
    }
    public void SelectQuantity(String Quantity){
        new WebDriverWait(driver , Duration.ofSeconds(10)).until(visibilityOf(SelectQuantity_id));
        SelectQuantity_id.sendKeys(Keys.CLEAR,Quantity);
    }
    public void EnterDeliveryAddress(String EnterAddress){
        EnterDeliveryAddress_id.sendKeys(EnterAddress);
    }
    public void ClickNextButton(){
        ClickNextButton_id.click();
    }


}
