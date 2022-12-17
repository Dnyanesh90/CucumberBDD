package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cogmento {
	WebDriver driver;
	
	@Given("user open a browser")
	public void user_open_a_browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kadam\\eclipse-workspace1\\Cucumber\\Cucumber\\AllDriverFolder\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Given("user on CRM login page")
	public void user_on_crm_login_page() {
		 driver.get("https://ui.cogmento.com/");
	    
	}
	@When("enter valid username and password in CRM")
	public void enter_valid_username_and_password_in_crm() {
		driver.findElement(By.name("email")).sendKeys("dnyaneshkadam0702@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Dk@7798913075");
	    driver.findElement(By.xpath("//div[text()='Login']")).click();
}
	
	@Then("user is on CRM home page")
	public void user_is_on_crm_home_page() {
		System.out.println(driver.getCurrentUrl());
	}


}
