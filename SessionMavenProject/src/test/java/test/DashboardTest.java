package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class DashboardTest {

	WebDriver driver;

	@BeforeMethod
	public void startBrowser() {
		driver = BrowserFactory.startBrowser();

	}

	@Test
	public void userQuickDraft() {
		// driver.get(url);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("opensourcecms", "opensourcecms");
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.titlecontent();
		
		
		String expectedTitle = "Your Recent Drafts"; // To store the actual title
		boolean actualTitle = dashboardPage.isQuickDraftPostDisplayed(); // To get and store the title
		System.out.println(actualTitle); // To print
		Assert.assertEquals(actualTitle, expectedTitle, "Your Recent Post Not Displayed!");

	}
	
	

}
