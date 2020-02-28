package com.aldrich;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP03 {
	private WebDriver driver;
	
	String Entrada1="Test";
	int contador = 1;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.linkText("Empleos")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-menu-1\"]/li[8]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu-menu-1\"]/li[8]/form/label/input")).sendKeys(Entrada1);
		driver.findElement(By.xpath("//*[@id=\"menu-menu-1\"]/li[8]/form/label/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu-menu-1\"]/li[8]/a")).click();

	}

}