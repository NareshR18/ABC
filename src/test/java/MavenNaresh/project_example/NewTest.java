package MavenNaresh.project_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	 
	  
	  System.setProperty("webdriver.chrome.driver", 
			   "C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
	  
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.instagram.com/");
  }
}
