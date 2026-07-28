package RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpicejetButtons {

    WebDriver driver;

    @Test
    public void setup() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        Thread.sleep(5000);

        
        driver.findElement(By.xpath("(//*[name()='circle'])[5]")).click();
        Thread.sleep(5000);

       
        driver.findElement(By.xpath("(//*[name()='circle'])[2]")).click();
        Thread.sleep(5000);

        List<WebElement> circleElements = driver.findElements(By.xpath("//*[name()='circle']"));

        System.out.println("=== RADIO BUTTONS DETAILS ===");
        System.out.println("Total Radio Buttons : " + circleElements.size());

        for (int i = 0; i < circleElements.size(); i++) {

            WebElement element = circleElements.get(i);

            System.out.println("Button " + (i + 1) + ":");
            System.out.println("Tag : " + element.getTagName());
            System.out.println("Displayed : " + element.isDisplayed());
            System.out.println("Enabled : " + element.isEnabled());
            System.out.println("Class : " + element.getAttribute("class"));
            System.out.println("Role : " + element.getAttribute("role"));
            System.out.println("Aria-checked : " + element.getAttribute("aria-checked"));
            System.out.println("-------------------------------------");
        }

        driver.quit();
    }
}