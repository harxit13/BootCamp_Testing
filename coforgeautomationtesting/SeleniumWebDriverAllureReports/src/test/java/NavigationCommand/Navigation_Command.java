package NavigationCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;
import org.testng.annotations.Test;
public class Navigation_Command {
	@Test
	public void NavigateBackward() {
		ChromeDriver driver = new ChromeDriver();

	    driver.get("https://www.google.com/");
	    driver.navigate().to("https://login.yahoo.com/");

	    driver.navigate().back();

	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);

	    String Title = driver.getTitle();
	    System.out.println(Title);
	}
	@Test
	public void NavigateForward() {
		ChromeDriver driver = new ChromeDriver();

	    driver.get("https://www.google.com/");
	    driver.navigate().to("https://login.yahoo.com/");

	    driver.navigate().back();
	    driver.navigate().forward();

	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);

	    String Title = driver.getTitle();
	    System.out.println(Title);
	}
	@Test
	 public void RefreshMethod() {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://login.yahoo.com/");
		 String URL= driver.getCurrentUrl();
			System.out.println(URL);
			driver.navigate().refresh();
			String Title = driver.getTitle();
			System.out.println(Title);
			driver.navigate().refresh();
			URL=driver.getCurrentUrl();
			System.out.println(URL);
	 }
}
