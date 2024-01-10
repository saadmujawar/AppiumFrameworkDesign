package org.saad;

import org.openqa.selenium.By;
import org.saad.pageObjects.ios.AlertViews;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSBasics extends IOSBaseTest{

	
	@Test
	public void IOSBasicsTest()
	{
		//Xpath, classname, IOS, iosClassCHain, IOSPredicateString, accessibility id, id
		
		
		//Xpath -XMl language- App source
		AlertViews alertViews = homePage.selectAlertViews();
		alertViews.fillTextLabel("Hello");
		String actualMessage= alertViews.getConfirmMessage();
		Assert.assertEquals(actualMessage, "A meesage should be a short, complete sentence.");
		
	    
		
		
		
		
		
		
		
	}
}
