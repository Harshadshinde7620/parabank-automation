package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;



	//Login page locators
	private By username_loc= By.xpath("//input[@name='username']");
	private By password_loc= By.xpath("//input[@name='password']");

	private By login_btn=By.xpath("//input[@value='Log In']");


	//Other locators
	private By logout_link = By.linkText("Log Out");

	private By balance_loc = By.xpath("(//td[@align='right'])[1]");


	//constructor

	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}

	//Action Method
	public void login(String username, String password) {
		driver.findElement(username_loc).sendKeys(username);
		driver.findElement(password_loc).sendKeys(password);
		driver.findElement(login_btn).click();
	}

	public void printAccountBalance() {

	    String balance =
	            driver.findElement(balance_loc).getText();

	    System.out.println("Account Balance is: " + balance);
	}

	public void logout() {

	    driver.findElement(logout_link).click();
	}

}
