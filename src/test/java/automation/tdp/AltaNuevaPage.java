package automation.tdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AltaNuevaPage extends Base{
	
	By btnOptions = By.linkText("ALTAS NUEVAS");
	By dniLocator = By.name("docNroDni");
	By lista_Departamento = By.name("department");

	public AltaNuevaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void altaNueva() throws InterruptedException {
		if(isDisplayed(btnOptions)) {
			click(btnOptions);
			Thread.sleep(2000);
			type("48091530", dniLocator);
		} else {
			System.out.println("Alta nueva no se encuentra");
		}
	}
//	
//	public String selectLista_Departamento() {
//		
//		Select selectList = new Select(findElement(lista_Departamento));
//		selectList.selectByVisibleText("Lima");
//		return getText(selectList.getFirstSelectedOption());
//	}

}
