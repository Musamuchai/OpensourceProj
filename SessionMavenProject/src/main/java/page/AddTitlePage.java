package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddTitlePage extends BasePage {

	WebDriver driver; // Global

	// Every Page must have a constructor to invite the driver
	public AddTitlePage(WebDriver driver) {
		this.driver = driver;
	}

//	@FindBy(how = How.ID, using = "title")
//	WebElement Title;
//	@FindBy(how = How.NAME, using = "content")
//	WebElement Content;
//	@FindBy(how = How.ID, using = "save-post")
//	WebElement SaveDraft;
//
//	public void Title(String title) {
//
//		Random rnd = new Random();
//		int randomNumber = rnd.nextInt(442);
//		Title.sendKeys("Sam's Work!!" + randomNumber);
//		Content.sendKeys("Selenium Automation is Good!!" + randomNumber);
//		SaveDraft.click();
//	}
}
