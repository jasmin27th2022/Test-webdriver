package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ActionClass.BaseClassAction;

import org.openqa.selenium.support.ui.ExpectedConditions;
public class checkboxes extends BaseClassAction{
	
	SoftAssert softassert = new SoftAssert();

	@Test
	public void validateCheckboxes() throws InterruptedException {
		
		// locate and click on CB link
		WebElement cb_link = driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]"));
		new WebDriverWait((WebDriver) driver, 10).until(ExpectedConditions.visibilityOf(cb_link));
		cb_link.click();

		// verify if checkboxes page is open
		String act_url = ((WebDriver) driver).getCurrentUrl();
		String exp_url = "http://localhost:7080/checkboxes";
		System.out.println(act_url);
		if (act_url.equals(exp_url)) {
			softassert.assertTrue(true);
		}

		// get list of all checkboxes
		List<WebElement> chkList = driver.findElements(By.xpath("//form//input[@type='checkbox']"));

		// iterate and select unselected checkboxes
		for (int i = 0; i < chkList.size(); i++) {
			if (chkList.get(i).isSelected() == false) {
				chkList.get(i).click();
				Thread.sleep(1000);
			}
			// verify all checkboxes selected
			if (chkList.get(i).isSelected() == false) {
				softassert.assertTrue(false);
			}

		}
		softassert.assertAll();

	}

}
