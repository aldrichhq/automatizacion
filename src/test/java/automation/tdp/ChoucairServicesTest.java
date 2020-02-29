package automation.tdp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ChoucairServicesTest {
	private WebDriver driver;
	ChoucairServices choucairServices;

	@Before
	public void setUp() throws Exception {
		choucairServices = new ChoucairServices(driver);
		driver = choucairServices.chromeDriverConnection();
		driver.manage().window().maximize();
		choucairServices.visit("https://www.choucairtesting.com");
	}

	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}

	@Test
	public void IngresarServicio() throws InterruptedException {
		Thread.sleep(2000);
		choucairServices.ingresarServicio();
	}

}
