package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base{
	
	By userLocator = By.name("userName");
	By passLocator = By.name("password");
	By btnSignLocator = By.name("login");
	
	By homePageLocator = By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']");


	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn() {
		if(isDisplayed(userLocator)) {
			type("qualityadmin", userLocator);
			type("pass1", passLocator);
			click(btnSignLocator);
		} else {
			System.out.println("username textbox was not present");
		}
	}
	
	public boolean isHomePageDisplayed() {
		return isDisplayed(homePageLocator);
	}

}
