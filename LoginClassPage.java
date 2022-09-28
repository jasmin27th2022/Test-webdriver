package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginClassPage {
	
	//constructor to invoke driver
		public LoginClassPage(WebDriver driver) {
			super();
		}

		@FindBy(xpath = "//input[@id='username']")
		WebElement username;

		@FindBy(xpath = "//input[@id='password']")
		WebElement password;

		@FindBy(xpath = "//i[contains(text(),'Login')]")
		WebElement login_btn;

		@FindBy(xpath = "//div[@id='flash']")
		WebElement errorMsg;

		public void enterUsername(String userName) throws InterruptedException {
			username.sendKeys(userName);
			Thread.sleep(1000);
		}

		public void enterPassword(String passWord) throws InterruptedException {
			password.sendKeys(passWord);
			Thread.sleep(1000);
		}

		public void clickLgnBtn() throws InterruptedException {
			login_btn.click();
			Thread.sleep(1000);
		}

		public String getErrorMsg() {
			String loginErrMsg = errorMsg.getText();
			return loginErrMsg;

		}


}
