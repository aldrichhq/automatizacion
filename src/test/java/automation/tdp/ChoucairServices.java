package automation.tdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChoucairServices extends Base {


	By servicioLink = By.linkText("Servicios");
	By servicioLocator = By.xpath("//div[@class='elementor-element elementor-element-bd039e7 elementor-widget elementor-widget-image animated fadeIn']//img[@class='attachment-full size-full']");
	By coockienBtn = By.id("cookie_action_close_header");
	
	
	
	public ChoucairServices(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void ingresarServicio() throws InterruptedException	{
		
		click(servicioLink);
		time(5);
		
		if(isDisplayed(servicioLocator))	{
			
			click(coockienBtn);
 			print("Pesta�a Servicios OK");
		}
		else 
		{
			print("Pesta�a Servicios ");
		}
		
		time(5);
	}
}