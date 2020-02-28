package com.aldrich;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	private WebDriver driver;
	By service = By.linkText("Servicios");
//	By imgservice = By.cssSelector("body.page-template.page-template-page-templates.page-template-page_front-page.page-template-page-templatespage_front-page-php.page.page-id-6052.sydney.group-blog.mob-menu-slideout-over.elementor-default.elementor-kit-7865.elementor-page.elementor-page-6052.siteScrolled:nth-child(2) div.hfeed.site:nth-child(2) div.page-wrap div.container.content-wrapper div.row div.fp-content-area main.site-main div.entry-content div.elementor.elementor-6052 div.elementor-inner div.elementor-section-wrap section.has_eae_slider.elementor-element.elementor-element-b1ccefb.elementor-section-stretched.elementor-section-full_width.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section:nth-child(1) div.elementor-container.elementor-column-gap-default div.elementor-row div.has_eae_slider.elementor-element.elementor-element-f355afb.elementor-column.elementor-col-100.elementor-top-column div.elementor-column-wrap.elementor-element-populated div.elementor-widget-wrap div.elementor-element.elementor-element-bd039e7.elementor-widget.elementor-widget-image.animated.fadeIn div.elementor-widget-container div.elementor-image > img.attachment-full.size-full");
	By imgservice = By.xpath("//div[@class='elementor-element elementor-element-bd039e7 elementor-widget elementor-widget-image animated fadeIn']//img[@class='attachment-full size-full']");
	By buscar = By.xpath("//div[@class='search_submit']//input");
	By resultado = By.cssSelector("body.page-template.page-template-elementor_header_footer.page.page-id-344.sydney.group-blog.mob-menu-slideout-over.elementor-default.elementor-template-full-width.elementor-kit-7865.elementor-page.elementor-page-344.siteScrolled:nth-child(2) div.hfeed.site:nth-child(2) div.page-wrap div.container.content-wrapper div.row div.elementor.elementor-344 div.elementor-inner div.elementor-section-wrap section.has_eae_slider.elementor-element.elementor-element-396931d6.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section:nth-child(12) div.elementor-container.elementor-column-gap-default div.elementor-row div.has_eae_slider.elementor-element.elementor-element-26cbf626.elementor-column.elementor-col-100.elementor-top-column div.elementor-column-wrap.elementor-element-populated div.elementor-widget-wrap div.elementor-element.elementor-element-69c063a9.elementor-widget.elementor-widget-shortcode:nth-child(2) div.elementor-widget-container div.elementor-shortcode div.job_listings ul.job_listings:nth-child(3) li.post-7766.job_listing.type-job_listing.status-publish.has-post-thumbnail.hentry a:nth-child(1) > img.company_logo");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(service).click();
		Thread.sleep(4000);
		if (driver.findElement(imgservice).isDisplayed()) {
			System.out.println("Pruebas");
			
			
		} else {
			System.out.print("Mal");
		}
//		driver.findElement(idubicacion).sendKeys("lima");
//		driver.findElement(buscar).click();
//		Thread.sleep(4000);
//		if (driver.findElement(resultado).isDisplayed()) {
//			System.out.print("Pruebas Exitosas");
//		}
//		else {
//			System.out.print("Is Not Ok");
//		}
	}

}