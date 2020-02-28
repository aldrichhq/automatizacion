package com.aldrich;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.ComparisonFailure;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChoucairServices {
	
	private WebDriver driver;    // objeto webdriver
	
	By servicesLinkLocator = By.linkText("Servicios");
	By servicesPageLocator = By.xpath("//div[@class='elementor-element elementor-element-bd039e7 elementor-widget elementor-widget-image animated fadeIn']//img[@class='attachment-full size-full']");
	By cookiesBtnLocator = By.id("cookie_action_close_header");
	By mainContainerElement3 = By.linkText("Portafolio de Soluciones");
	
	@Before                    // anotacion 1. JUnit
	public void setUp()       // metodo de configuracion
	
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();                                 // declaracion objeto driver
		driver.manage().window().maximize();                        // crea ventana simulador chrome
		driver.get("https://www.choucairtesting.com");             // url a consultar
		
	}
	
	@Test
	public void testEnterChoucairServices() throws InterruptedException // test 1
	{
		driver.findElement(servicesLinkLocator).click();                  // Click en servicios
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		if(driver.findElement(servicesPageLocator).isDisplayed())        // imagen servicios mostrada / caso prueba CP_Add2
		{
			driver.findElement(cookiesBtnLocator).click();                    // acepta cookies
			assertEquals("Servicios – Choucair Testing", driver.getTitle());   // compara titulo pestanna / caso prueba CP_Add1
			System.out.print("Pagina de servicios encontrada");
		}
		else 
		{
			System.out.print("Pagina de servicios NO encontrada");
		}
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	
	@Test
	public void testServicesItems() throws InterruptedException    //  test2
	{
		driver.findElement(servicesLinkLocator).click();                    // click servicios
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		if(driver.findElement(servicesPageLocator).isDisplayed())          // imagen servicios mostrada
		{
			driver.findElement(cookiesBtnLocator).click();                  // acepta cookies
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			System.out.println("Pagina de servicios encontrada");
			
			driver.findElement(mainContainerElement3).click();              // click portafolio soluciones
			System.out.println("Usuario ubicado en los items de servicios");
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			
			List<WebElement> divIcons = driver.findElements(By.className("elementor-image-box-title"));  // iconos portafolio
			String infoTitles[] = {"Digital Performance Management","Pruebas para aplicativos móviles","Pruebas para Business Intelligence","Pruebas de Usabilidad",
								"Pruebas contables y financieras","Pruebas de Desempeño","Pruebas de Migración","Pruebas generalistas","Automatización de Pruebas SAP",
								"Automatización de Pruebas","Administración de Ambientes de Pruebas","Automatización de Pruebas para Switches transaccionales",
								"Pruebas de Nómina","Pruebas de Seguridad","Alta automatización","Cursos y Certificaciones"};  // titulos info mostrada
			                                                                                                                 
			Actions actions = new Actions(driver);
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			int j = 0;
			for(int i=3;i<19;i+=1)                // recorre los iconos de portafolio
			{
				WebElement element = driver.findElement(By.linkText(divIcons.get(i).getText()));  
				actions.moveToElement(element).click().perform();                     // click en cada icono
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				try {
				assertEquals(divIcons.get(i).getText(), infoTitles[j]);     // compara titulo icono con titulo info mostrada
				}                                                          // Caso de prueba CP_add4
				catch(ComparisonFailure e) {
					System.out.print("Actual: ");                      // imprime diferencias en las comparaciones
					System.out.println(e.getActual());
					System.out.print("Expected: ");
					System.out.println(e.getExpected());
				}
				j+=1;
			}
		}
		else
		{
			System.out.print("Pagina de servicios NO encontrada");
		}
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();    // cierra ventanas de ejecucion
	}
}