package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ActionClass.LoginClassAction;
import PageClass.LoginClassPage;

public class successfulLogin extends LoginClassAction{
	
	@Test
	public void verifySuccessfulLogin() throws InterruptedException {

		LoginClassPage lp = new LoginClassPage(driver);
		lp.enterUsername("tomsmith");
		lp.enterPassword("SuperSecretPassword!");
		lp.clickLgnBtn();

		String successfulLogin_actualtitle = driver.getTitle();
		System.out.println("Actual title is: " + successfulLogin_actualtitle);
		String successfulLogin_expectedtitle = "The Internet";
		Assert.assertEquals(successfulLogin_actualtitle, successfulLogin_expectedtitle);
	}

}
