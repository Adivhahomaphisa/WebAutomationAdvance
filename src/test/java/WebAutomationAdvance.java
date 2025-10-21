
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WebAutomationAdvance {
    WebDriver driver;

    @BeforeTest
    public void LaunchBrowser() {
        driver = new ChromeDriver();
    }

    @Test(priority = 0)
    public void StartTheBrowser() throws InterruptedException {
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void VefifyHomepageDisplay() throws InterruptedException {
        driver.findElement(By.id("nav-btn-overview")).isDisplayed();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void ClickLearningMaterial() throws InterruptedException {
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void EnterEmailAddress() throws InterruptedException {
        driver.findElement(By.id("login-email")).sendKeys("Adivhaho.Maphisa@gmail.com");
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void EnterPassword() throws InterruptedException {
        driver.findElement(By.id("login-password")).sendKeys("Adivhaho");
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void ClickLoginButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void ClickWebAutomationAdvance() throws InterruptedException {
        driver.findElement(By.id("tab-btn-web")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void DeviceType() throws InterruptedException {
        driver.findElement(By.id("deviceType")).sendKeys("Phone");
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void SelectBrand() throws InterruptedException {
        driver.findElement(By.id("brand")).sendKeys("Apple");
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void Storage() throws InterruptedException {
        driver.findElement(By.id("storage-128GB")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void Colour() throws InterruptedException {
        driver.findElement(By.id("color")).sendKeys("Blue");
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void Quality() throws InterruptedException {
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("3");
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public void DeliveryAddress() throws InterruptedException {
        driver.findElement(By.id("address")).sendKeys("182 william mandela drive");
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void ClickNextButton() throws InterruptedException {
        driver.findElement(By.id("inventory-next-btn")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void ShippingMethod() throws InterruptedException {
        driver.findElement(By.id("shipping-option-express")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void Warranty() throws InterruptedException {
        driver.findElement(By.id("warranty-option-2yr")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public void Discount() throws InterruptedException {
        driver.findElement(By.id("discount-code")).sendKeys("Save10");
        Thread.sleep(2000);
    }

    @Test(priority = 17)
    public void ClickApplyButton() throws InterruptedException {
        driver.findElement(By.id("apply-discount-btn")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 18)
    public void AddToCart() throws InterruptedException {
        driver.findElement(By.id("add-to-cart-btn")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 19)
    public void ChooseDeviceType() throws InterruptedException {
        driver.findElement(By.id("deviceType")).sendKeys("Laptop");
        Thread.sleep(2000);
    }

    @Test(priority = 20)
    public void SelectDeviceBrand() throws InterruptedException {
        driver.findElement(By.id("brand")).sendKeys("Macbook pro");
        Thread.sleep(2000);
    }

    @Test(priority = 21)
    public void StorageType() throws InterruptedException {
        driver.findElement(By.id("storage-256GB")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 22)
    public void ChooseColour() throws InterruptedException {
        driver.findElement(By.id("color")).sendKeys("Gold");
        Thread.sleep(2000);
    }

    @Test(priority = 23)
    public void SelectQuantity() throws InterruptedException {
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("2");
        Thread.sleep(2000);
    }

    @Test(priority = 24)
    public void EnterAddress() throws InterruptedException {
        driver.findElement(By.id("address")).sendKeys("182 william mandela drive");
        Thread.sleep(2000);
    }

    @Test(priority = 25)
    public void NextButton() throws InterruptedException {
        driver.findElement(By.id("inventory-next-btn")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 26)
    public void SelectShippingMethod() throws InterruptedException {
        driver.findElement(By.id("shipping-option-express")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 27)
    public void WarrantyOptions() throws InterruptedException {
        driver.findElement(By.id("warranty-option-2yr")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 28)
    public void DiscountCode() throws InterruptedException {
        driver.findElement(By.id("discount-code")).sendKeys("Save10");
        Thread.sleep(2000);
    }

    @Test(priority = 29)
    public void Apply() throws InterruptedException {
        driver.findElement(By.id("apply-discount-btn")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 30)
    public void ClickAddToCart() throws InterruptedException {
        driver.findElement(By.id("add-to-cart-btn")).click();
        Thread.sleep(200);
    }

    @Test(priority = 31)
    public void ReviewOrder() throws InterruptedException {
        driver.findElement(By.id("review-cart-btn")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 32)
    public void PlaceOrder() throws InterruptedException {
        driver.findElement(By.id("confirm-cart-btn")).click();
        Thread.sleep(200);
    }

    @Test(priority = 33)
    public void ViewInvoice() throws InterruptedException {
        driver.findElement(By.id("view-history-btn")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 34)
    public void DownloadInvoice() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(text(), 'Save as PDF')]")).click();
        Thread.sleep(2000);
    }
    @AfterTest
   public void closeBrowser() {
        driver.quit();
    }
}

