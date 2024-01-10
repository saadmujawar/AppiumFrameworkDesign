package org.saad.utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class AppiumUtils {
	AppiumDriver driver;
	public AppiumUtils(AppiumDriver driver)
	{
		this.driver=driver;
	}
	public Double getFormattedAmount(String amount)
	{
		Double price =Double.parseDouble(amount.substring(1));
		return price;
	}
	public void waitForElementToAppear(WebElement ele)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains((ele),"text" , "Cart"));
			
	}

}
