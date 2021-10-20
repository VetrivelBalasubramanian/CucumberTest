package com.StepDef;

import com.BaseClass.Libglobal;
import com.pageObjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageDef extends Libglobal {

	LoginPage LP;
	
	
	@Given("user is on login page {string}")
	public void user_is_on_login_page(String expectedPageTitle) {

		System.out.println("first Method");
		startDriver();
		progressHelpers.waitForPageLoad();
		if (driver.getWindowHandles().size() == 2) {
			browserHelper.SwitchToWindow(1);
		}
		assertHelper.assertTextMatching(expectedPageTitle.toLowerCase(),
				browserHelper.getCurrentPageTitle().toLowerCase());
		progressHelpers.waitForPageLoad();
	}

	@When("user enter the login credentials {string},{string}")
	public void user_enter_the_login_credentials(String username, String password) {

		progressHelpers.waitForPageLoad();
		
		buttonHelper.click(LP.getMenuLink_SignIn());
		
		progressHelpers.waitForElementToBeClickable(LP.getTextField_Email());
		generalHelper.enterTextInTextField(LP.getTextField_Email(), username);
		generalHelper.enterTextInTextField(LP.getTextField_Password(), password);

		buttonHelper.click(LP.getBtn_SignIn());
		progressHelpers.waitForPageLoad();
	}

	@Then("validate the login page {string}")
	public void validate_the_login_page(String usernameintheheader) {

		progressHelpers.waitForElementAttributeValueToChanged(LP.getText_UserNameInTheHeader(), "innerText",
				usernameintheheader);

		assertHelper.assertTextMatching(usernameintheheader, generalHelper.getText(LP.getText_UserNameInTheHeader()));

	}

}
