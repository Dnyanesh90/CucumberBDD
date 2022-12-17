package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbcreate {
	WebDriver driver;
	@Given("user is on Register Page")
	public void user_is_on_register_page() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace\\Cucumber\\Cucumber\\Driver\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
	}
	@When("user enter {string}, {string}, {string} and {string}")
	public void user_enter_and(String fname, String lname, String emailId, String pass) {
		driver.findElement(By.name("firstname")).sendKeys(fname);
		   driver.findElement(By.name("lastname")).sendKeys(lname);
		   driver.findElement(By.name("reg_email__")).sendKeys(emailId);
		   driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
			
	}
	@Then("user will be created in system")
	public void user_will_be_created_in_system() throws InterruptedException {

		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}


}
