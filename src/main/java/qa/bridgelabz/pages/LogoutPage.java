package qa.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import qa.bridgelabz.baseClass.BaseClass;

public class LogoutPage extends BaseClass{
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[3]/div/div/a/div")
	WebElement more;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[3]/div/div/div[1]/div/div[1]/div[7]/div/div/div/div/div/div")
	WebElement logOut;
	
	public LogoutPage(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logOut() throws InterruptedException {
		 Thread.sleep(1000);
		 DashBoard dash = new DashBoard(driver);
		 dash.loginToDashBoard();
		 Thread.sleep(1000);
		 more.click();
		 Thread.sleep(1000);
		 logOut.click();
		
	}
	

}
