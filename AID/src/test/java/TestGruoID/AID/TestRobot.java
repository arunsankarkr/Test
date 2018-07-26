package TestGruoID.AID;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestRobot {
	WebDriver driver; 
	@BeforeTest
	  public void beforeTest() {
		  
//		  System.setProperty("webdriver.chrome.driver", "C:\\Maahi\\Drivers\\chromedriver.exe");
//		  driver = new ChromeDriver();
//		  driver.get("https://www.timesjobs.com/candidate//register.html");
	  }
  @Test
  public void f() throws AWTException, InterruptedException 
  {
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_WINDOWS);
	  Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_WINDOWS);
	  Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_CAPS_LOCK);
	  r.keyRelease(KeyEvent.VK_CAPS_LOCK);
  }
}
