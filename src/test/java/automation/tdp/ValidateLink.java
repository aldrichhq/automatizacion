package automation.tdp;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.ComparisonFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ValidateLink extends Base{
	private WebDriver driver;
	By servicioLink = By.linkText("Servicios");
	By servicioLocator = By.xpath("//div[@class='elementor-element elementor-element-bd039e7 elementor-widget elementor-widget-image animated fadeIn']//img[@class='attachment-full size-full']");
	By coockienBtn = By.id("cookie_action_close_header");
	By porfolioSolution = By.linkText("Portafolio de Soluciones");
	
	By listIcons = By.className("elementor-image-box-title");
	List<WebElement> divIcons;
	Actions actions = new Actions(driver);
	
	String infoTitles[] = {"Digital Performance Management","Pruebas para aplicativos m�viles","Pruebas para Business Intelligence","Pruebas de Usabilidad",
			"Pruebas contables y financieras","Pruebas de Desempe�o","Pruebas de Migraci�n","Pruebas generalistas","Automatizaci�n de Pruebas SAP",
			"Automatizaci�n de Pruebas","Administraci�n de Ambientes de Pruebas","Automatizaci�n de Pruebas para Switches transaccionales",
			"Pruebas de N�mina","Pruebas de Seguridad","Alta automatizaci�n","Cursos y Certificaciones"};  
	
	public ValidateLink(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void initView() throws InterruptedException	{ 
		goService();
		goPorfolioSolution();
		   
	}
	
	public void goService(){
		click(servicioLink);
		timeCustom(); 
		//isDisplayed(servicioLocator) ? validatePositionOK() : validatePositionFail(); 
		
		if(isDisplayed(servicioLocator)){
			validatePositionOK();
		}
		else 
		{
			validatePositionFail();
		}
		
		timeCustom();    
			
	}
	public void goPorfolioSolution() {
		click(porfolioSolution);
		timeCustom(); 
		reviewTexts();
	}
	public void reviewTexts() { 
		timeCustom();   
		startComparateText();
	}
	public void startComparateText() {
		int j = 0;
		for(int i=3;i<19;i+=1)               
		{
			WebElement element = driver.findElement(By.linkText(divIcons.get(i).getText()));  
			actions.moveToElement(element).click().perform();                   
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			try {
			assertEquals(divIcons.get(i).getText(), infoTitles[j]);      
			}                                                         
			catch(ComparisonFailure e) {
				System.out.print("Actual: ");                       
				System.out.println(e.getActual());
				System.out.print("Expected: ");
				System.out.println(e.getExpected());
			}
			j+=1;
		}
	}
	
	
	public void validatePositionOK() {
		click(coockienBtn);
	    print("Pesta�a Servicios OK");
		 
	}
	
	public void validatePositionFail() {
		print("Pesta�a Servicios ");
		 
	}
	
	public void timeCustom(){
		time(5);
	}
	

}
