package com.aldrich;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP07 {

	private WebDriver driver;
	String ubicaciones[] = {"Lima","5","*","%","1234","    "};
		
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.linkText("Empleos")).click();
		Thread.sleep(2000);
		for (int i = 0; i < ubicaciones.length; i++) {
			driver.findElement(By.xpath("//*[@id=\"search_location\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"search_location\"]")).sendKeys(ubicaciones[i]);
			driver.findElement(By.xpath("//*[@value=\"Buscar trabajos\"]")).click();
			Thread.sleep(3000);
		}
		
	}

}