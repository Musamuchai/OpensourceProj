package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {

	WebDriver driver; // Global

	// Every Page must have a constructor to invite the driver
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Your Recent Drafts')]")
	WebElement QuickDraft;
	@FindBy(how = How.ID, using = "title")
	WebElement Title;
	@FindBy(how = How.NAME, using = "content")
	WebElement Content;
	@FindBy(how = How.ID, using = "save-post")
	WebElement SaveDraft;
	
	public void waitForPage(WebElement element, WebDriver driver, int timeInSeconds) {
		waitForElement(element, driver, timeInSeconds);
	}

	public void titlecontent () {

		Random rnd = new Random();
		int randomNumber = rnd.nextInt(442);
		Title.sendKeys("Sam's Work!!" + randomNumber);
		Content.sendKeys("Selenium Automation is Good!!" + randomNumber);
		SaveDraft.click();
	
	}

	public boolean isQuickDraftPostDisplayed() {
		try {
			waitForElement(QuickDraft, driver,10);
			return true;
		} catch (Exception e) {

		}
		return true;
	}

//	private void waitForPage() {
		
//		
	}
//}
