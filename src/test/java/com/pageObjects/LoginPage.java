package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Libglobal;

public class LoginPage extends Libglobal {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='customer-login-link']")
	private WebElement menuLink_SignIn;

	@FindBy(xpath = "//*[@id='send2-login' or @id='send2']")
	private WebElement btn_SignIn;

	@FindBy(xpath = "//*[@id='email-login' or @id='email']")
	private WebElement textField_Email;

	@FindBy(xpath = "//*[@id='pass-login' or @id='pass']")
	private WebElement textField_Password;

	@FindBy(xpath = "//div[@class='panel header']//li[@class='greet welcome']//span")
	private WebElement text_UserNameInTheHeader;

	public WebElement getMenuLink_SignIn() {
		return menuLink_SignIn;
	}

	public WebElement getBtn_SignIn() {
		return btn_SignIn;
	}

	public WebElement getTextField_Email() {
		return textField_Email;
	}

	public WebElement getTextField_Password() {
		return textField_Password;
	}

	public WebElement getText_UserNameInTheHeader() {
		return text_UserNameInTheHeader;
	}

}
