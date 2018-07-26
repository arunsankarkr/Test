package com.accenture.test;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestJS {
	WebDriver driver;
  @Test
  public void f() {
	  JavascriptExecutor JSE = (JavascriptExecutor) driver;
	  JSE.executeScript("alert('hello')");
	  driver.switchTo().alert().accept();
	  JSE.executeScript("window.scroll(0,1000)");
	  driver.close();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Maahi\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.timesjobs.com/candidate//register.html");
  }

}
