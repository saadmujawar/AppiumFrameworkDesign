package org.saad.pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.saad.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage extends AndroidActions{
	//create constructor will auomatically when we call this class
	AndroidDriver driver;
	public FormPage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Saad");
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField" )
	private WebElement nameField;
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField"))
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
	private WebElement femaleOption;
	//driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']"))
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Male']")
	private WebElement maleOption;
	
	@AndroidFindBy(id="android:id/text1")
	private WebElement countrySelection;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement shopButton;
	
	public void setNameField(String name)
	{
		nameField.sendKeys(name);
		driver.hideKeyboard();
	}
	public void  setGender(String gender)
	{
		if(gender.contains("female"))
			femaleOption.click();
		else
			maleOption.click();
		
	}
	
	public void setCountrySelection(String countryName)
	{
		countrySelection.click();
		scrollToText(countryName);
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+countryName+"']")).click();
	}
	
	public ProductCatalogue submitForm()
	{
		shopButton.click();
		return new ProductCatalogue(driver);
	}
	
	

}
