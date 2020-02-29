package automation.tdp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;


public class ValidateLinkTest {
	 private WebDriver driver;
	 private ValidateLink validateLink;
	 
	 
	@Before
	public void setUp() throws Exception {
		validateLink = new ValidateLink(driver);
		driver = validateLink.chromeDriverConnection();
		driver.manage().window().maximize();
		validateLink.visit("https://www.choucairtesting.com");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		validateLink.initView();
	}

}
