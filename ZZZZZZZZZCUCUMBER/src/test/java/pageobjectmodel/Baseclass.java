package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Baseclass {
	
	
	WebDriver driver;
By user_id=By.id("email");

By pass=By.id("pass");
By log=By.xpath("//button[@data-testid=\"royal_login_button\"]");

public Baseclass(WebDriver driver) {
	this.driver= driver;
}

public void facebooklog(String username) {
	
	driver.findElement(user_id)
	.sendKeys(username);
}
	
	public void facebooid(String password) {
		
		driver.findElement(pass).sendKeys(password);
	}
public void ck() {
	
	driver.findElement(log).click();;
}
}
