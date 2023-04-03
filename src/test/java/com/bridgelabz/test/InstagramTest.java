package com.bridgelabz.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.bridgelabz.baseClass.BaseClass;
import qa.bridgelabz.pages.DashBoard;
import qa.bridgelabz.pages.LikePosts;
import qa.bridgelabz.pages.LoginPage;
import qa.bridgelabz.pages.LogoutPage;
import qa.bridgelabz.pages.Message;
import qa.bridgelabz.pages.RegistrationPage;
import utility.Data_Provider;

public class InstagramTest extends BaseClass {

	RegistrationPage registration;
	LoginPage login;


	@BeforeMethod
	public void initialization () { 
		setup();
		registration = new RegistrationPage(driver);
		login = new LoginPage(driver);
	}

	@Test(priority = 0)
	public void redirectOnSignup() throws InterruptedException {
		log.debug("signUp");
		String title = registration.redirectToSignUpPage();
		Thread.sleep(1000);
		Assert.assertEquals("Sign up • Instagram", title); 
		log.info("Redirecting on singUp page");
	}

	@Test(priority = 1)
	public void insertDatainToTheRegistrationField () throws InterruptedException {
		Thread.sleep(1000);
		boolean isEnable = registration.enterDataIntoTheFields();
		Assert.assertEquals(true, isEnable);
		log.info("Data inserted successfully");
	}

	@Test(priority = 2, dataProvider = "testData", dataProviderClass = Data_Provider.class )
	public void loginToInstagram (String user_N, String pswd) throws InterruptedException {
		login.loginToInstagram(user_N, pswd);
		Thread.sleep(500);
		log.info("Enter all data which is available into sheet");
	}

	@Test(priority = 3)

	public void followPeople() throws InterruptedException {
		Thread.sleep(3000);
		DashBoard db=new DashBoard(driver);
		db.loginToDashBoard();
		Thread.sleep(1000);
	}

	@Test(priority = 4)
	public void logoutInstagram() throws InterruptedException {
		Thread.sleep(2000);
		LogoutPage lp=new LogoutPage(driver);
		lp.logOut();
	}

	@Test(priority = 5)
	public void LikeAllPostsFromInsta() throws InterruptedException {

		LikePosts like=new LikePosts(driver);
		like.likeMaxPost();
	}
	
	@Test(priority = 6)
	public void messageToPeople() throws InterruptedException {
		Message msg = new Message(driver);
		msg.messageToSearchPeople();
	}

	@AfterMethod
	public void tearDown() {
		closeWindow();

	}

}
