package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.ID, using = "user_login")  
	WebElement UserName;
	@FindBy(how = How.ID, using = "user_pass")
	WebElement Password;
	@FindBy(how = How.NAME, using = "wp-submit")
	WebElement LogIn;

	// Methods to interact with the elements
	public void login(String userName, String password) {

//		String UserName = "opensourcecms";
//		String Password = "opensourcecms";

//		driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
//		driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
//		driver.findElement(By.name("wp-submit")).click();

		UserName.sendKeys(userName);
		Password.sendKeys(password);
		LogIn.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
}