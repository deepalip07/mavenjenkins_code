package Project1.Amazon_end_to_end;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Login_Page 
{
	
	WebDriver driver;
	//1
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement  password;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	
	
	public void login()
	{
		username.sendKeys("7972542126");
		continue_button.click();
		password.sendKeys("Deepm@n21111");
		signin_button.click();
	}
	
	public Amz_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}	


}
