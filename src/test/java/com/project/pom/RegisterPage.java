package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Base {
	
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("//img[@src='/images/masts/mast_register.gif']");

	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	By confirmPassswordLocator = By.cssSelector("input[name=\"confirmPassword\"]");

	By registerBtnLocator = By.name("register");
	
	By registeredMessage = By.tagName("font");
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerUser() throws InterruptedException {
		click(registerLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(registerPageLocator)) {
			type("qualityadmin", usernameLocator);
			type("pass1", passwordLocator);
			type("pass1", confirmPassswordLocator);
			
			click(registerBtnLocator);
		} else {
			System.out.println("Register pages was not found");
		}
		
	}
	
	public String registeredMessage() {
		List<WebElement> fonts = findElements(registeredMessage);
		return getText(fonts.get(5));
	}

}
