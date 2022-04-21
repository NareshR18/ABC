import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_framework {

	@Test(alwaysRun = true)
	private static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(enabled = false)
	private static void nares() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@Ignore
	@Test
	public static void googl() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}

	@Test(priority = -1)
	private static void gmail() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = "gmail")
	private static void facebook() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test(invocationCount = 2)
	public static void hotstar() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nares\\eclipse-workspace\\project_example\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotstar.com/in");
		driver.manage().window().maximize();
	}

	@Test(expectedExceptions = Exception.class)
	private static void m1() {
		int a = 15;
		System.out.println("Total no. of students in a batch:" + (a / 0));
	}

	@Test(timeOut = 1500)
	public static void method2() throws InterruptedException {
		String s = "Framework";
		Thread.sleep(1000);
		System.out.println(s);
	}
}
