package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
WebDriver driver;
	
	@FindBy(id = "gender-female")
	static WebElement ChkBox_Gender;
	@FindBy(id = "FirstName")
	static WebElement TxtBox_FirstName;
	@FindBy(id = "LastName")
	static WebElement TxtBox_LastName;
	@FindBy(id = "Email")
	static WebElement TxtBox_Email;
	@FindBy(id = "Password")
	static WebElement TxtBox_Password;
	@FindBy(id = "ConfirmPassword")
	static WebElement TxtBox_ConfirmPassword;
	@FindBy(id = "register-button")
	static WebElement Btn_register;
	@FindBy(xpath="//input[@class='button-1 register-continue-button']")
	static WebElement Btn_countinue;
	
	
public static void registration(String F,String L,String E,String P,String CP)
{
	ChkBox_Gender.click();
	TxtBox_FirstName.clear();
	TxtBox_FirstName.sendKeys(F);
	TxtBox_LastName.clear();
	TxtBox_LastName.sendKeys(L);
	TxtBox_Email.clear();
	TxtBox_Email.sendKeys(E);
	TxtBox_Password.clear();
	TxtBox_Password.sendKeys(P);
	TxtBox_ConfirmPassword.clear();
	TxtBox_ConfirmPassword.sendKeys(CP);
	Btn_register.click();
	Btn_countinue.click();
}
public Registration(WebDriver driver)
{
	this.driver=driver;
}
}
