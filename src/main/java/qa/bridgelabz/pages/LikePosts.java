package qa.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.bridgelabz.baseClass.BaseClass;

public class LikePosts extends BaseClass{
	WebDriver dirver;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]/section/main/div/div[4]/article/div[1]/div/div[1]/div[1]/a/div/div[2]")
	WebElement post;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/article/div/div[2]/div/div/div[2]/section[1]/span[1]/button")
	WebElement heart;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[1]/div/div/div/button")
	WebElement Nxtpost;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/article/div/div[2]/div/div/div[2]/section[1]/span[1]/button")
	WebElement heart1;
	

	public LikePosts(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void likeMaxPost() throws InterruptedException {
		DashBoard db1 = new DashBoard(driver);
		db1.loginToDashBoard();
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 600).perform();
		
		Thread.sleep(1000);
		post.click();
		Thread.sleep(1000);
		heart.click();
		Thread.sleep(1000);
		Nxtpost.click();
		Thread.sleep(1000);
		heart1.click();
		Thread.sleep(1000);
		

	}

}
