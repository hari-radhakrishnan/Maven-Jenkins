import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;

	
	@Given("User is on Homepage")
	public void user_is_on_homepage() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("User navigate to Login page")
	public void user_navigate_to_login_page() {
	    driver.get("https://www.facebook.com/");
	}

	@And("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
	    driver.findElement(By.name("email")).sendKeys(username);
	    driver.findElement(By.name("pass")).sendKeys(password);
	}

	@Then("Login successful")
	public void login_successful() {
		driver.findElement(By.name("login")).click();
	}

}
