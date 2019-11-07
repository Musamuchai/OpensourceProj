package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.BasePage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest extends BasePage {

	WebDriver driver;

	@BeforeMethod
	public void startBrowser() {
		// Starts the browser and saves the driver in the test class
		driver = BrowserFactory.startBrowser();
	}

	@Test(priority = 1)
	public void validUserShouldBeAbleToLogin() {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("opensourcecms", "opensourcecms");

		// Validate page show up using the title
		String expectedTitle = "Dashboard ‹ opensourcecms — WordPress"; // To store the actual title
		String actualTitle = loginPage.getPageTitle(); // To get and store the title
		System.out.println(actualTitle); // To print
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page!");

//		loginPage.login("opensourcecms", "opensourcecms");
		// OR
		// Validate page show up using the Explicit Wait
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class); // Object Reference

//		dashboardPage.waitForPage;
	}

	@Test(priority = 2)
	public void invalidUserShouldNotBeAbleToLogin() {

		// Take you to the site
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		// Calling LoginPage Class or Activate
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		// Validate page show up using the title
		String expectedTitle = "Log In ‹ opensourcecms — WordPress"; // To store the actual title
		String actualTitle = loginPage.getPageTitle(); // To get and store the title
		System.out.println(actualTitle); // To print
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page!");

		// Call the login method from the LoginPage Class
		loginPage.login("opensourcecms", "abcuybobbi");

		// Validate Dashboard Page did not show up using Expilicit Wait try/catch
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class); // Object Reference
		Assert.assertTrue(dashboardPage.isQuickDraftPostDisplayed(), "Invalid User was unable to login!!");

	}

	@AfterMethod
	public void close() {
		// close and quit
		driver.close();
		driver.quit();
	}
//}
}