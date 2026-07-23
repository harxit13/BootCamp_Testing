package Library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusability {
	public static void capturedScreenshot(WebDriver driver,String screenShotName) {
		try {
			TakesScreenshot ts =(TakesScreenshot) driver;
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  	    FileUtils.copyFile(src, new File("./ScreenShots/" + screenShotName +".png"));
	  	    System.out.println("Captured Screenhsot -by selenium Webdriver");
		}
		  catch(Exception e){
			System.out.println("Exception While Taking Screen Shot" + e.getMessage());
		}
	}

}
