package PomClassProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testCase {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		Login loginpg = new Login(driver);
		
		driver.get("https://www.saucedemo.com/");
		loginpg.enterUsername("standard_user");
		loginpg.enterpassword("secret_sauce");
		loginpg.clickonLogin();
	}
}