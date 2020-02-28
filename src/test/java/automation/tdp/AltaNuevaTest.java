package automation.tdp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.webElements.packg.DropdownList_Page;

public class AltaNuevaTest {
	private WebDriver driver;
	AltaNuevaPage altanuevaPage;

	@Before
	public void setUp() throws Exception {
		altanuevaPage = new AltaNuevaPage(driver);
	}

	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}
	
	@Test
	public void ingresarDNI() throws InterruptedException {
		altanuevaPage.altaNueva();		
	}
	

//	@Test
//	public void dropdownList() {
//		assertEquals(altanuevaPage.selectLista_Departamento(),"Lima");
//	}

}
