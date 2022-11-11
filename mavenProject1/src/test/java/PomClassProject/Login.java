package PomClassProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	//constructot
	
	Login(WebDriver d)
	{
		driver=d;
		//this will create webelement
		PageFactory.initElements(driver, this);
	}
	//identify web elements
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickonLogin() {
		loginbutton.click();
	}

}
