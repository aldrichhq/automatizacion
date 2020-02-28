package com.aldrich;


import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP08 {
	private WebDriver driver;
	
	String entradas[] = {"Analista","Analista","5","2","    "};
	String ubicaciones[] = {"Lima","5","*","Panama","    "};

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
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.linkText("Empleos")).click();
		Thread.sleep(2000);
		for (int i = 0; i < entradas.length; i++) {
			driver.findElement(By.xpath("//*[@id=\"search_keywords\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"search_location\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"search_keywords\"]")).sendKeys(entradas[i]);
			driver.findElement(By.xpath("//*[@id=\"search_location\"]")).sendKeys(ubicaciones[i]);
			driver.findElement(By.xpath("//*[@value=\"Buscar trabajos\"]")).click();
			Thread.sleep(3000);		
			
			
		
		}
		
	}

}