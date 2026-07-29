package PageFactory; // Remember to rename this package to TestCases if you experience import conflicts with Selenium's PageFactory


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.slopecalculator;
import Utility.BrowserFactory;
import Utility.ConfigDataProvider;
import Utility.ExcelDataProvider;


public class Login {
    public WebDriver driver; 
    public ConfigDataProvider config;
    public ExcelDataProvider excel;
    public slopecalculator cal;
    @BeforeTest
    public void setup() {
        config = new ConfigDataProvider();
        
        // Start the browser using the utility
        driver = BrowserFactory.startApplication(driver, config.getBrowser()); 
        excel=new ExcelDataProvider();
        cal=new slopecalculator(driver);
        // Navigate to the target URL
        driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
    }

    @Test(priority=1)
    public void login() throws InterruptedException {
    
        LoginPage loginPage = new LoginPage(driver);
        
       
        loginPage.loginToApplication("chaudharyharshit1310@gmail.com", "8755185366@aQ");
    }

    @Test(priority=2)
    public void slopecalculator () throws InterruptedException {
        
        HomePage homePage = new HomePage(driver);
        
      
        homePage.clickslopecalculator();
    }

   @Test(priority=3)
   public void slopecal() {
	   String x1=excel.getStringData("Sheet1", 0, 0);
	   String x2=excel.getStringData("Sheet1", 0, 1);
	   String y1=excel.getStringData("Sheet1", 0, 2);
	   String y2=excel.getStringData("Sheet1", 0, 3);
	   String ExpectedResult=excel.getStringData("Sheet1", 0, 4);
	   cal.calculateSlope(x1, x2, y1, y2);
	   String ActualResult=cal.getActualResult();
	   Assert.assertEquals(ActualResult, ExpectedResult, "Slope Calculation Mismatch");
	   
	   
	   
   }
}