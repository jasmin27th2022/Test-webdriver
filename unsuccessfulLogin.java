package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ActionClass.LoginClassAction;
import PageClass.LoginClassPage;

public class unsuccessfulLogin extends LoginClassAction{
	
	@Test
	public void verifyUnsuccessfulLogin() throws InterruptedException {

		LoginClassPage lp = new LoginClassPage(driver);
		lp.enterUsername("Henry");
		lp.enterPassword("Wrong Password");
		lp.clickLgnBtn();
		String act_errmsg = lp.getErrorMsg();
		String exp_errmsg = "Your username is invalid!\n" + "×";

		Assert.assertEquals(act_errmsg, exp_errmsg);
		System.out.println("Unsuccessful login");

	}

}
