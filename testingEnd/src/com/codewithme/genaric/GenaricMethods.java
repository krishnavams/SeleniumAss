package com.codewithme.genaric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenaricMethods {
	public WebDriver webDriver;

	public void path() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
	}
	public WebDriver getWebDriver() {
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public void xpathClick(String xpath) {
		//webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.xpath(xpath)).click();
	}

	public void xpathSendKeys(String xpath, String keys) {
		//webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.xpath(xpath)).sendKeys(keys);
	}


}
