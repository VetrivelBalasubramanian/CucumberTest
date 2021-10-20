package com.BaseClass;

import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.BaseClass.LoggerHelper;
import com.utils.Data.PropertyReader;
import com.utils.driver.DriverFactory;
import com.utils.driver.DriverManager;

public class Libglobal implements BaseObjects {

	static protected WebDriver driver;

	public static SoftAssert softAssert;
	protected Logger logger = LoggerHelper.getLogger(Libglobal.class);
	
	//@BeforeMethod(alwaysRun = true)
	public void startDriver() {
		logger.info("===============================================TEST===============================================");
		softAssert = new SoftAssert();
		
		driver = DriverFactory.configDriver();
		DriverManager.setWebDriver(driver);
		logger.info("Browser is set and Launched");
		driver.navigate().to("https://www.partytopics.com/");
		//driver.navigate().to(PropertyReader.getConfigProperties(System.getProperty("ENV"), "url"));

	}

	@AfterMethod(alwaysRun = true)
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

	public void geturl(String url) {
		driver.get(url);

	}
}
