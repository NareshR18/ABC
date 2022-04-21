package MavenNaresh.project_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Listeners_Example {
	@Test
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(co);
		driver.get("google.co.in");
		driver.manage().window().maximize();

	}
}
