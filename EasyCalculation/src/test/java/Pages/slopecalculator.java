package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class slopecalculator {
	WebDriver driver;
	public slopecalculator(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='ahname']")
	WebElement x1Input;
	@FindBy(xpath="//input[@id='chname']")
	WebElement x2Input;
	@FindBy(xpath="//input[@id='bhname']")
	WebElement y1Input;
	@FindBy(xpath="//input[@id='dhname']")
	WebElement y2Input;
	
	@FindBy(xpath="//input[@value='Calculate']")
	WebElement calculate;
	public void calculateSlope(String x1, String x2, String y1, String y2)
	{
		x1Input.clear();
		x1Input.sendKeys(x1);
	x2Input.clear();
		x2Input.sendKeys(x2);
		y1Input.clear();
		y1Input.sendKeys(y1);
		y2Input.clear();
		y2Input.sendKeys(y2);
		calculate.click();
	}
	public String getActualResult()
	{
		return driver.findElement(By.xpath("//input[@id='mhname']")).getAttribute("value").trim();
	}

}
