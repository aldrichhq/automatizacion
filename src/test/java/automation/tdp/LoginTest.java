package automation.tdp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	private WebDriver driver;
	LoginPage loginPage;

	@Before
	public void setUp() throws Exception {
		loginPage = new LoginPage(driver);
		driver = loginPage.chromeDriverConnection();
//		driver.manage().window().maximize();
		loginPage.visit("https://tdp-web-venta-fija-qa.mybluemix.net/login");
	}

	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}

	@Test
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
		loginPage.LoginIn();
		Thread.sleep(4000);
		assertTrue(loginPage.isHomePageDisplayed());
	}

}
