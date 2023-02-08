package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToggleAllCheckBoxPage;
import util.BrowserFactory;

public class ToggleAllRemoveTest {
	WebDriver driver;

	@Before
	public void init() {
		driver = BrowserFactory.initDriver();
	}

	@Test
	public void RemoveAllTest() {
	

		ToggleAllCheckBoxPage TP = PageFactory.initElements(driver, ToggleAllCheckBoxPage.class);
		TP.clickCheckBox();
		TP.removeButton();

	}
	@After
	public void tearDown() {
		driver = BrowserFactory.tearDown();
		
	}

}
