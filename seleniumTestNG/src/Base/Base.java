package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public  void SetupDriveManager() {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public void SetUpUrl(String url) {
		driver.get(url);
	}
	public void Click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public  void sendKeys(String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	public boolean isDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public  void close() {
		driver.close();
	}
	
	ChromeOptions COption = new ChromeOptions();
	COption.setHeadless(false);
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(COption);
	
	driver.manage().window().maximize();
	
}//main


