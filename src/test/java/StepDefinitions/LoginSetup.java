package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSetup {
	
	WebDriver driver;
	
	


	@Given("I am on the login page")
	public void i_am_on_the_login_page() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
	
	}
	@When("I enter valid credentials")
	public void i_enter_valid_credentials() throws InterruptedException {
	    
		driver.findElement(By.name("username")).sendKeys("Admin");
	    
	    
	    driver.findElement(By.name("password")).sendKeys("admin123");
		
	    Thread.sleep(2000);
	    
	}
	@When("I click the login button")
	public void i_click_the_login_button() throws InterruptedException {
		driver.findElement(By.className("orangehrm-login-button")).click();

		Thread.sleep(3000);
	   
	}
	@Then("I should be redirected to the dashboard")
	public void i_should_be_redirected_to_the_dashboard() throws InterruptedException {
		 String currentUrl = driver.getCurrentUrl();
	        if (!currentUrl.contains("dashboard")) {
	            throw new AssertionError("Not redirected to the dashboard. Current URL: " + currentUrl);
	        }
	        Thread.sleep(3000);
	        driver.quit();
	}



}
