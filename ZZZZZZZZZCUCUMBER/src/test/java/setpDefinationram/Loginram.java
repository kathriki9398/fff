package setpDefinationram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginram {
	
	
	WebDriver driver;
	
	
	
	
	@Given("go to facebook login page")
	public void go_to_facebook_login_page() {
	    
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
	}

	@When("^enter (.+) and (.+)")
	public void enter_userid_and_password(String userid, String password) {

		driver.findElement(By.id("email")).sendKeys(userid);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		

	}

	@Then("hit login button")
	public void hit_login_button() {

		driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();
		
		
	}


	@Then("navigate to home page")
	public void navigate_to_home_page() {

		driver.navigate().back();

		
		
	}
	
	@After
public void ram () {
	
	driver.quit();
}

}
