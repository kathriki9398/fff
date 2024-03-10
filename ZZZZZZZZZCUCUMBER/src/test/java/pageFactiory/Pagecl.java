package pageFactiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagecl {
	
	WebDriver driver;
	
	@FindBy( id="email")
	WebElement user;
@FindBy(id= "pass")
	WebElement id;
	
	@FindBy(xpath = "//button[@data-testid=\\\"royal_login_button\\\"]")
	
	WebElement ck;
	
	
	public Pagecl(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void mani1(String username) {
		
		user.sendKeys(username);
	}
	
	public void mani2(String password) {
		
		id.sendKeys(password);
	}
	public void sc() {
		
		ck.click();
	}
	
}
