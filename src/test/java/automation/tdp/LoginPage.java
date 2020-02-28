package automation.tdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends Base {
	By userLocator = By.name("username");
	By btnSignLocator = By.className("texto_center");
	By passLocator = By.id("password");
	By btnIngresarLocator = By.className("boton_greentdp");
	By homePageLocator = By.xpath("//img[@src='/assets/user.a1682501340f67dd06324cc63bd212e9.png']");

	By dni = By.name("docNroDni");
	By department = By.name("department");

	By parentescoSelect = By.name("parentescoSelect");

	By provincia = By.name("city");
	By distrito = By.name("district");

	By btnAlta = By.linkText("ALTAS NUEVAS");

	By continuarr___ = By.linkText("OBVIAR Y CONTINUAR");

	By boton_greentdp_btn = By.className("boton_greentdp_btn");

	By btncontinuar = By.className("boton_greentdp_btn");

	By reniec_ = By.linkText("SIGUIENTE");

	By direccion_ = By.name("direccion");
	By referencia_ = By.name("referencia");

	By ubicar_ = By.linkText("UBICAR EN MAPA");

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void LoginIn() throws InterruptedException {
		Thread.sleep(4000);
		if (isDisplayed(userLocator)) {
			type("123816", userLocator);
			click(btnSignLocator);
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(4000);
			type("Vent@2020", passLocator);
			click(btnIngresarLocator);

			Thread.sleep(8000);
			click(btnAlta);

			Thread.sleep(5000);
			click(continuarr___);

			Thread.sleep(3000);
			type("70192337", dni);
//			Thread.sleep(2000);

			click(department);
			Select depa_ = new Select(findElement(department));
			depa_.selectByVisibleText("Lima");

			click(provincia);
			Select provincia_ = new Select(findElement(provincia));
			provincia_.selectByVisibleText("Lima");

			click(distrito);
			Select distrito_ = new Select(findElement(distrito));
			distrito_.selectByVisibleText("Lima");

//			Thread.sleep(2000);

			click(boton_greentdp_btn);

			Thread.sleep(8000);

			click(btncontinuar);
// 	 		Thread.sleep(3000);
// 			
// 			click(boton_greentdp_btn);
// 	 		Thread.sleep(3000);
// 			
// 			click(xxx);

			Select reniec = new Select(findElement(parentescoSelect));
			reniec.selectByVisibleText("Ana Luz");

			click(reniec_);
			Thread.sleep(3000);
			type("Alameda mz d lt 15", direccion_);
			type("Alameda mz d lt 15", referencia_);

			click(ubicar_);

		} else {
			System.out.println("username textbox was not present");
		}
	}

	public boolean isHomePageDisplayed() {
		return isDisplayed(homePageLocator);
	}

}