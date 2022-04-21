package MavenNaresh.project_example;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Browser_Launch {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		FileInputStream f= new FileInputStream
		("C:\\Users\\nares\\eclipse-workspace\\project_example\\src\\test\\java\\MavenNaresh\\project_example\\loginpage.properties");

		Properties prop= new Properties();
		prop.load(f);
		String usname = prop.getProperty("username");
		String pword = prop.getProperty("password");
		PageFactory.initElements(driver, BrowserLaunch_Webelements.class);
		BrowserLaunch_Webelements.Uname.sendKeys(usname);
		BrowserLaunch_Webelements.pw.sendKeys(pword);
		BrowserLaunch_Webelements.login.click();

	}
}
