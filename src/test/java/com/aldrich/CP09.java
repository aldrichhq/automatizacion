package com.aldrich;


import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP09 {


		private WebDriver driver;
		
		@Before
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.choucairtesting.com/");	
			
		}
		
		@Test
		public void testPage() {
			
			test();
			
			
			driver.navigate().to("https://www.choucairtesting.com/empleos-testing/");
			 List <WebElement> elements = driver.findElements (By.className("elementor-image-box-wrapper"));
			   driver.manage().timeouts().implicitlyWait(04, TimeUnit.SECONDS);
			   WebElement empleo = driver.findElement(By.id("menu-item-550"));
		       elements.get(0).click();
		       driver.manage().timeouts().implicitlyWait(04, TimeUnit.SECONDS);
		       elements.get(1).click();
		       driver.manage().timeouts().implicitlyWait(04, TimeUnit.SECONDS);
		       elements.get(2).click();
		       empleo.click();
			
		}
		
		public void test() {
			for (int i=0;i<3;i++) {
				
				//assertEquals("Pruebas de software centradas en su negocio",driver.getTitle());
				
				WebElement Link = driver.findElement(By.xpath("//*[@id=\'menu-item-550\']/a"));
				Link.click();
				driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				 //assertEquals("SER CHOUCAIR",driver.getTitle());
				driver.navigate().to("https://www.choucairtesting.com/");
				driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					
				}
		}
		

		@After
		public void tearDown() {
			System.out.print("entro en los enlaces de forma correcta");
			driver.quit();
		}
		


}