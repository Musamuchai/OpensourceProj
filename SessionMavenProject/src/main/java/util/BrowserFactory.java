package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	// global, so all methods can use
	static WebDriver driver;

	public static WebDriver startBrowser() {
		// Set Chrome Driver Properties
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();

		// Create ChromeDriver object and launch chrome browser
		WebDriver driver = new ChromeDriver();

		// return the driver to the test class
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		return driver;
	}
}
