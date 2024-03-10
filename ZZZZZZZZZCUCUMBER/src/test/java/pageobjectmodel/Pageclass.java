package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Pageclass {
	
	
	WebDriver driver;
	
	@BeforeTest
	
	public void ram() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
		
	}
	
	@Test
	public void ram123() {
		
		Baseclass lali= new Baseclass(driver);
		
		lali.facebooid("kathikriramanjaneyulu@gmail.com");
		lali.facebooid("Ramau@9398");
		lali.ck();
	}
	@AfterTest
	public void ram423() {
		
		driver.quit();
	}

}
