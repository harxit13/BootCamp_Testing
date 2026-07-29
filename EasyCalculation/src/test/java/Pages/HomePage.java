package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[normalize-space()='Slope Calculator'])[1]")
    WebElement  slopeCalculatorIcon;

    public void clickslopecalculator() throws InterruptedException {
        slopeCalculatorIcon.click();
        Thread.sleep(2000); 
        
        //slopeCalculatorIcon.click();
    }
    }