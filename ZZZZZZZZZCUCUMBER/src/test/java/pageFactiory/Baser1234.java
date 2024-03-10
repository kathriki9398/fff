package pageFactiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectmodel.Baseclass;

public class Baser1234 {

	
	
WebDriver driver;
	
	@BeforeTest
	
	public void ram() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
		
	}
	
	@Test
	public void ram1243() {
		Pagecl jg=new Pagecl(driver);
		
		jg.mani1("kathrikiramanjaneyulu@gmail.com");
		
		jg.mani2("Ramu@9398");
		jg.sc();
		
		
	}
	@AfterTest
	public void ram423() {
		
		driver.quit();
	}
	
	
	
}
