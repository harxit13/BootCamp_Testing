package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver BrowserOptions(String browserN,String url) {
		if(browserN.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browserN.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if(browserN.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
