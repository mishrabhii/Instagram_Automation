package qa.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.bridgelabz.baseClass.BaseClass;

public class DashBoard extends BaseClass{
	WebDriver driver;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]")
	WebElement loginButton;
	
	@FindBy(xpath= "/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div/div[1]/div/div[2]/div[2]/div/a/div")
	WebElement searchFeature;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div/input")
	WebElement searchBar;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/a/div/div/div/div[2]/div/div")
	WebElement SearchPPL;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]/section/main/div/header/section/div[1]/div[2]/div/div[1]")
	WebElement follow;
	
		
	public DashBoard(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void loginToDashBoard() throws InterruptedException{
		userName.click();
		userName.sendKeys("sanjaymishra2912");
		password.sendKeys("sanjay@2912");
		loginButton.click();		
		searchFeature.click();
		searchBar.sendKeys("Ashne");
		SearchPPL.click();
		follow.click();
		Thread.sleep(1000);
		
	}
	
	

}
