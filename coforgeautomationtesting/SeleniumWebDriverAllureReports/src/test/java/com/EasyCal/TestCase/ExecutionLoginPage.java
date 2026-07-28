package com.EasyCal.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EasyCalculation.Pages.LogiinEasyCal;

import Helper.BrowserFactory;

public class ExecutionLoginPage {
	@Test
	public void Validity() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
		LogiinEasyCal loginPageEasyCal = PageFactory.initElements(driver, LogiinEasyCal.class);
		loginPageEasyCal.login_Easycal("9740673180", "raghubn@123");
	}

}
