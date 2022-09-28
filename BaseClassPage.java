package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClassPage {
	
	protected WebDriver driver;

	//constructor
	public void BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
