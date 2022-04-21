package MavenNaresh.project_example;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Loginpage {
  @Test
  public void login() throws IOException, InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://adactinhotelapp.com/");
	  driver.manage().window().maximize();
	  FileInputStream filein=new FileInputStream("C:\\Users\\nares\\eclipse-workspace\\project_example\\src\\test\\java\\MavenNaresh\\project_example\\loginpage.properties");
	  Properties p=new Properties();
	  p.load(filein);
	  PageFactory.initElements(driver, BrowserLaunch_Webelements.class);
	  Thread.sleep(2000);
	  BrowserLaunch_Webelements.Uname.sendKeys(p.getProperty("username"));
	  Thread.sleep(2000);
	  BrowserLaunch_Webelements.pw.sendKeys(p.getProperty("password"));
	  Thread.sleep(2000);
	  BrowserLaunch_Webelements.login.click();
	  Thread.sleep(2000);
	  boolean display = BrowserLaunch_Webelements.logintitle.isDisplayed();
	  Assert.assertEquals(display, true);
  }
}
