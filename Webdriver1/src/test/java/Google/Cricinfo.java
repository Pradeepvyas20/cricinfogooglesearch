package Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricinfo {
	
	WebDriver driver; 
	  @BeforeTest
	  public void beforeTest() 
	  {
		    WebDriverManager.chromedriver().setup();
		 	driver=new ChromeDriver();
		 	driver.get("https://www.google.com");
		 	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 	driver.manage().window().maximize();
	  }
  @Test
  public void testcase() throws InterruptedException {
	  JavascriptExecutor js=( JavascriptExecutor)driver;
		 
		 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cricinfo",Keys.ENTER);
		 Thread.sleep(3000);
		 driver.findElement(By.partialLinkText("Live cricket scores, match schedules, latest cricket news ...")).click();
		 driver.findElement(By.partialLinkText("Teams")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("India")).click();
		 Thread.sleep(3000);
		 js.executeScript("document.getElementsByClassName('ds-flex ds-flex-row ds-space-x-4')[0].scrollIntoView()");
		 Thread.sleep(4000);
		 driver.findElement(By.partialLinkText("Ganguly, Morgan, Muralidaran, Misbah, Johnson among 53 players in Legends League Cricket")).click();
	  
	  
  }
  
  @AfterTest
  public void afterTest()
  {
	  //driver.close();
  }
  }
  

