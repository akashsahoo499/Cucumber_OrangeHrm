package stepDefinition;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLoginSteps {
	WebDriver driver;
	@Given("i open browser with url {string}")
	public void i_open_browser_with_url(String url) {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(url);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("i should see login page")
	public void i_should_see_login_page() {
	   if(driver.findElement(By.name("Submit")).isDisplayed())
	   {
		   System.out.println("Login Page Displayed");
	   }
	}

	@When("i enter username as {string}")
	public void i_enter_username_as(String user) {
	    driver.findElement(By.name("txtUsername")).sendKeys(user);
	}

	@When("i enter password as {string}")
	public void i_enter_password_as(String pass) {
	  driver.findElement(By.name("txtPassword")).sendKeys(pass);
	}

	@When("i click login button")
	public void i_click_login_button() throws Throwable {
	   driver.findElement(By.name("Submit")).click();
	   Thread.sleep(3000);
	}

	@Then("Login should be success")
	public void login_should_be_success() {
		String Expected="dashboard";
		String Actual=driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Fail");
		}
	}

	@When("i close browser")
	public void i_close_browser() {
	  driver.quit();
	}

	@Then("i should see error message{string}")
	public void i_should_see_error_message(String error) {
	    String error_message=driver.findElement(By.id("spanMessage")).getText();
	  System.out.println(error_message);
	}


}
