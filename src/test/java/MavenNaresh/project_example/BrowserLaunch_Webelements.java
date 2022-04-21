package MavenNaresh.project_example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserLaunch_Webelements {

	@FindBy(xpath = "//input[@type='text']")
	public static WebElement Uname;

	@FindBy(xpath = "//input[@type='password']")
	public static WebElement pw;

	@FindBy(xpath = "//input[@value='Login']")
	public static WebElement login;
	
	@FindBy(name="q")
	public static WebElement search;
	
	@FindBy(xpath="(//h3[@class=\"LC20lb MBeuO DKV0Md\"])[1]")
	public static WebElement adactin;

	@FindBy(name="btnK")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//td[@class='login_title']")
	public static WebElement logintitle;
	
}
