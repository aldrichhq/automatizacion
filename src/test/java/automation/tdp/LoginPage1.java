package automation.tdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 extends Base{
	By userLocator = By.name("username");
	By btnSignLocator = By.className("texto_center");
	By passLocator = By.id("password");
	By btnIngresarLocator = By.className("boton_greentdp");
	By homePageLocator = By.xpath("//img[@src='/assets/user.a1682501340f67dd06324cc63bd212e9.png']");

	public LoginPage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void LoginIn() throws InterruptedException {
		Thread.sleep(4000);
		if(isDisplayed(userLocator)) {
			type("128304", userLocator);
			click(btnSignLocator);
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(4000);
			type("Vent@2019", passLocator);
			click(btnIngresarLocator);
		} else {
			System.out.println("username textbox was not present");
		}
	}
	
	public boolean isHomePageDisplayed() {
		return isDisplayed(homePageLocator);
	}



}
