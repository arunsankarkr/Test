package TestGruoID.AID;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionTest {
	
	WebDriver driver; 
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Maahi\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.timesjobs.com/candidate//register.html");
  }
  public static void  setClipboardData(String string) {
	  StringSelection stringSelection = new StringSelection(string);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	  
  }
  
  @Test
  public void f() throws AWTException, InterruptedException {
	  Actions a = new Actions(driver);
	  WebElement email = driver.findElement(By.id("emailAdd"));
	  a.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("NewUser").perform();	  
	  driver.findElement(By.id("resumeFile_basic")).click();
	  
	  Robot r = new Robot();
	//  setClipboardData("C:\\Users\\pdc4-training.pdc4\\Pictures\\Screenshots\\Screenshot (2).png");
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_V);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_V);
	  Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);

  }

  @AfterTest
  public void afterTest() {
  }

}
