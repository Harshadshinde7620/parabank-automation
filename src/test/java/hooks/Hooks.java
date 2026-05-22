package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {


	public static WebDriver driver;

	@Before
	public void browserSetup() {
        WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Browser launched sucessfully");

	}

	@After
	public void teardown() {
		if(driver != null) {
		//driver.quit();
		}
	System.out.println("Browser closed sucessfully");
	}


}
