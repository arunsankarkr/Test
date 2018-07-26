package com.accenture.test;

import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.Registration;
import com.accenture.utilities.ExcelUtility;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Registration_Test {
	WebDriver driver;
	HomePage home;
	Registration register;
	ExcelUtility e ;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Maahi\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  home = PageFactory.initElements(driver, HomePage.class);
	  register = PageFactory.initElements(driver, Registration.class);
	  e = new ExcelUtility();
  }
  
  @Test
  public void TestRegistration() throws IOException {
	  home.clickRegistration();
	  e.getTestData();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
