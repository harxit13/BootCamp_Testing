package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Utility.BrowserFactory;
import Utility.ConfigDataProvider;
import Utility.ExcelDatareader;
import Utility.Helper;

public class BaseClass {
    public WebDriver driver;
    public ExcelDatareader excel;
    public ConfigDataProvider config;
    
    @BeforeSuite
    public void SetUp() {
    	excel = new ExcelDatareader();
    	config = new ConfigDataProvider();
    }
    @BeforeClass
    public void BrowserTest() {
    	driver = BrowserFactory.BrowserOptions(driver, config.getBrowser(), config.getUrl());
    }
    @AfterClass
    public void tearDown() {
    	BrowserFactory.closeBrowser(driver);
    }
    @AfterMethod
    public void tearDownMethod(ITestResult result) throws Exception {
    	if(result.getStatus()==ITestResult.FAILURE) {
    		Helper.capturedScreenShot(driver);
    	}
    }
}
