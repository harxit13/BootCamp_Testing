package webDriiver.commands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BrowserCommand {
	@Test (priority=0)
	public void ChromeBrowserTest(){
		String ExpectedValueTitle="Test Login | Practice Test Automation";
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice/");
		driver.manage().window().maximize();
		
		String ActualValueTitle=driver.getTitle();
		if(ExpectedValueTitle==ActualValueTitle) {
			System.out.println("expected title is equal to actual title : "+ActualValueTitle);
		}else {
			System.out.println("expected title not equal to actual title");
		}
		
		//String BrowserTitle = driver.getTitle();
		//System.out.println(BrowserTitle);
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		//String PageContent = driver.getPageSource();
		//System.out.println(PageContent);
		driver.quit();
	}
	@Test(priority=1)
	public void FirefoxBrowserTest() {
		
		String ExpectedValueTitle="Selenium";
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        
        String ActualValueTitle=driver.getTitle();
    	if(ExpectedValueTitle==ActualValueTitle) {
    		System.out.println("expected title equal to actual title : "+ ActualValueTitle);
    	}else {
    		System.out.println("expected title not equal to actual title ");
    	}
		
		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);
		
		//String BrowserURL = driver.getCurrentUrl();
		//System.out.println(BrowserURL);
		driver.quit();
	}
	@Test (priority=2)
	public void EdgeBrowserTest() {
		String ExpectedValueTitle= "Just a sec";
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        
        String ActualValueTitle=driver.getTitle();
    	if(ExpectedValueTitle==ActualValueTitle) {
    		System.out.println("expected title equwl to actual title : "+ ActualValueTitle);
    	}else {
    		System.out.println("expected title not equal to actual title");
    	}
		
		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);
		
		//String BrowserURL = driver.getCurrentUrl();
		//System.out.println(BrowserURL);
		driver.quit();
	}

}
