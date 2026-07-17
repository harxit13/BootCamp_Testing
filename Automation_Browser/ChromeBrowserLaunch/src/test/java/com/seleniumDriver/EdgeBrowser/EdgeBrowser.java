package com.seleniumDriver.EdgeBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
	    driver.get("https://www.selenium.dev/downloads/");
	    driver.manage().window().maximize();
	}

}
