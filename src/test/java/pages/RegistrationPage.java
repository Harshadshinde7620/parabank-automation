package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	WebDriver driver;
	
	//homapge locators
    private By register_link = By.linkText("Register");
	
	//Registration page locators
	private By firstName_loc= By.xpath("//input[@id='customer.firstName']");
	private By lastName_loc= By.xpath("//input[@id='customer.lastName']");
	private By address_loc= By.xpath("//input[@id='customer.address.street']");
	private By city_loc=By.xpath("//input[@id='customer.address.city']");
	private By state_loc=By.xpath("//input[@id='customer.address.state']");
	private By zipcode_loc= By.xpath("//input[@id='customer.address.zipCode']");
	private By phonenumber_loc= By.xpath("//input[@id='customer.phoneNumber']");
	private By ssn_loc= By.xpath("//input[@id='customer.ssn']");
	
	private By username_loc= By.xpath("//input[@id='customer.username']");
	private By password_loc= By.xpath("//input[@id='customer.password']");
	private By confirm_loc=By.xpath("//input[@id='customer.password']");
	
	private By register_btn= By.xpath("//input[@value='Register']");
	
	//After Registration
	private By success_msg= By.xpath("//p[contains(text(),'Your account was created successfully')]");
	
	//constructor
	
	public RegistrationPage(WebDriver driver) {
		this.driver= driver;
	}
	
	//action methods

	//Homepage action methods this will click on the register link
	public void register_link() {
		driver.findElement(register_link).click();
	}
	
	//Registration page action method to fill the details
	public void register(String fName, String lName, 
			String address, String city, String state, String zipcode, 
			String phone, String ssn, String username, String password, 
			String cpassword) {
	
		driver.findElement(firstName_loc).sendKeys(fName);
		driver.findElement(lastName_loc).sendKeys(lName);
		driver.findElement(address_loc).sendKeys(address);
		driver.findElement(city_loc).sendKeys(city);
		driver.findElement(state_loc).sendKeys(state);
		driver.findElement(zipcode_loc).sendKeys(zipcode);
		driver.findElement(phonenumber_loc).sendKeys(phone);
		driver.findElement(ssn_loc).sendKeys(ssn);
		
		driver.findElement(username_loc).sendKeys(username);
		driver.findElement(password_loc).sendKeys(password);
		driver.findElement(confirm_loc).sendKeys(cpassword);

	}

	public void clickRegisterButton() {
		driver.findElement(register_btn).click();
	}
	
	public boolean isRegistrationSuccessful() {
	    return driver.findElement(success_msg).isDisplayed();
	}
	}


