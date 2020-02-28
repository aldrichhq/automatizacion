package com.aldrich;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prueba1 {
	
	private WebDriver driver;
//	By registerLinkLocator = By.linkText("REGISTER");
//	By registerPageLocator = By.xpath("//img[@src='/images/masts/mast_register.gif']");
//	
//	By usernameLocator = By.id("email");
//	By passwordLocator = By.name("password");
//	By confirmPassswordLocator = By.cssSelector("input[name=\"confirmPassword\"]");
//	
//	By registerBtnLocator = By.name("register");
	
//	By userLocator = By.name("username");
//	By passLocator = By.name("password");
//	By btnSignLocator = By.name("login");t
	
//	By homePageLocator = By.xpath("//img[@src='/images/masts/mast_flightfinder2.gif']");
//	By movistarPageLocator = By.xpath("//img[@src='/assets/logo_movistar.97bfb8b4bd2286c400ee900eccc4a147.png']");
	By userLocator = By.name("username");
	By btnSignLocator = By.className("texto_center");
	By passLocator = By.id("password");
	By btnIngresarLocator = By.className("boton_greentdp");
	By homePageLocator = By.className("user");
	By btnOptions = By.linkText("ALTAS NUEVAS");
	By dniLocator = By.name("docNroDni");
	By lista_Departamento = By.name("department");
	
	
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tdp-web-venta-fija-qa.mybluemix.net/login");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	
	@Test
	public void signIn() throws InterruptedException{
//		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("128304");			
			driver.findElement(btnSignLocator).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(passLocator).sendKeys("Vent@2019");
			driver.findElement(btnIngresarLocator).click();
			Thread.sleep(2000);
			driver.findElement(btnOptions).click();
			driver.findElement(dniLocator).sendKeys("48091530");
			
			
//			Thread.sleep(2000);
//			assertTrue(driver.findElement(homePageLocator).isDisplayed());
		}
		else {
			System.out.print("Username was not present");
		}
			
	}
	
	
//	@Test
//	public void registrarVenta() throws InterruptedException {
//		driver.findElement(registerLinkLocator).click();
//		Thread.sleep(2000);
//		if(driver.findElement(registerPageLocator).isDisplayed()){
//			driver.findElement(usernameLocator).sendKeys("qualityadmin");
//			driver.findElement(passwordLocator).sendKeys("pass1");
//			driver.findElement(confirmPassswordLocator).sendKeys("pass1");
//			
//			driver.findElement(registerBtnLocator).click();
//		}
//		else {
//			System.out.print("Register was not found");
//		}
//		
//		List<WebElement> fonts = driver.findElements(By.tagName("font"));
//		assertEquals("Note: Your user name is qualityadmin.", fonts.get(5).getText());
//	}

}
