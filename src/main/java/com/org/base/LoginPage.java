package com.org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy (id="email")
	public WebElement userName;
	@FindBy (id="pass")
	public WebElement Password;
	@FindAll  ({
		 @FindBy(id = "login"),
		 @FindBy(name = "login")
		 })   
	public WebElement loginbtn;
	//we have to create getter alone
	
	@FindBy (xpath="//div[contains(@class,'axz')]")
	public WebElement textEle;
	
	@FindBy (id="email")
	public WebElement getAttribute;
	
	@FindBy (id="email")
	public WebElement contextClick;
	
	@FindBy (id="email")
	public WebElement doubleClick;
	
	public WebElement getDoubleClick() {
		return doubleClick;
	}
	public WebElement getContextClick() {
		return contextClick;
	}
	public WebElement getGetAttribute() {
		return getAttribute;
	}
	public WebElement getTextEle() {
		return textEle;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
