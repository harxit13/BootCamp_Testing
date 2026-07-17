package SeleniumAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityoruseability.helper;

public class Alertsselenium {
	@Test
   public void Testpopup() throws Exception {
	   WebDriver driver = helper.startBrowser("Chrome");
	   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	   driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	   Thread.sleep(1000);
	   Alert alert = driver.switchTo().alert();
	   alert.accept();
	   Thread.sleep(1000);
	   String result = driver.findElement(By.cssSelector("#result")).getText();
	   System.out.println(result);
	   Assert.assertEquals("You successfully clicked an alert", result);
	   Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[@onclick='jsConfirm()']" )).click();
	     Thread.sleep(1000);
	     Alert alert2 = driver.switchTo().alert();
	     alert2.dismiss();
	     Thread.sleep(1000);
	     String result2= driver.findElement(By.cssSelector("#result")).getText();
	     System.out.println(result2);
	     Assert.assertEquals("You clicked: Ok", result2 );
       }
   }

