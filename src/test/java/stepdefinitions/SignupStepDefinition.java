package stepdefinitions;

import java.util.Random;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.RandomDataGenerator;

public class SignupStepDefinition {
	
    RegistrationPage registrationPage =
            new RegistrationPage(Hooks.driver);

    LoginPage loginPage =
            new LoginPage(Hooks.driver);
    
    String username;
    String password="Test@123";

	@Given("User launches Parabank application")
	public void user_launches_parabank_application() {
	   System.out.println("Parabank Application Launched");
	}

	@When("User clicks on Register link")
	public void user_clicks_on_register_link() {
		registrationPage.register_link();
	}

	@When("User enters all registration details")
	public void user_enters_all_registration_details() {
	
		username= RandomDataGenerator.generateRandomUsername();
		registrationPage.register(
				"Harshad", "Shinde", "Beed", "Beed", 
				"Maharahstra", "431127", "9876543211", "123459876", 
				username, password, password);
		
	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		registrationPage.clickRegisterButton();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		Assert.assertTrue(registrationPage.isRegistrationSuccessful());
		
		System.out.println("User account was created successfully");
	}

	@When("User logs out from application")
	public void user_logs_out_from_application() {
	
		loginPage.logout();
	}

	@When("User enters valid login credentials")
	public void user_enters_valid_login_credentials() {
	
		loginPage.login(username, password);
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		Assert.assertTrue(Hooks.driver.getPageSource()
				.contains("Accounts Overview"));
	
		System.out.println("User looged in sucessfully");
	}

	@Then("User prints account balance")
	public void user_prints_account_balance() {
		
		loginPage.printAccountBalance();
	
	}

}
