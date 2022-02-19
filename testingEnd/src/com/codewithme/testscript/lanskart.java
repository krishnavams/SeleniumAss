package com.codewithme.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codewithme.genaric.GenaricMethods;

import handling.MainSystem;

public class lanskart extends GenaricMethods {
	static WebDriver webDriver;
	static MainSystem mainSystem;

//	@Test(priority = 1)
//	public void checkEyeGlassSection() {
//		mainSystem.path();
//		gen.setWebDriver(webDriver);
//		webDriver.get("https://www.lenskart.com/");
//
//	}

	// @BeforeMethod
	public static void main(String a[]) {
		GenaricMethods gen = new GenaricMethods();
		gen.path();
		webDriver = new ChromeDriver();
		gen.setWebDriver(webDriver);
		webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		webDriver.get("https://www.lenskart.com/");
		gen.xpathClick("//span[contains(text(),'Sign In')]");
		gen.xpathClick("//button[text()='No thanks']");
		gen.xpathSendKeys("//input[@name='emailOrPhone']", "Shubhamraj8652@gmail.com");
		gen.xpathClick("//button[text()='Proceed']");
	}

//	@AfterMethod
//	public void logOut() {
//		mainSystem.path();
//		gen.setWebDriver(webDriver);
//	}

}
