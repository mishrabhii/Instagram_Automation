package qa.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import qa.bridgelabz.baseClass.BaseClass;

public class LoginPage extends BaseClass {
	WebDriver driver;
	
	@CacheLookup
	@FindBy(name = "username")
	WebElement userName;

	@CacheLookup
	@FindBy(name = "password")
	WebElement password;

	@CacheLookup
	@FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]")
	WebElement loginButton;

	public LoginPage(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void loginToInstagram (String user_N, String pswd) throws InterruptedException {
		userName.sendKeys(user_N);
		password.sendKeys(pswd);
		loginButton.click();
		Thread.sleep(500);
		checkRedirectOnHomePage();
	}

	public void checkRedirectOnHomePage () {
		String title = driver.getTitle();
		Assert.assertEquals("Instagram", title);

	}
}
