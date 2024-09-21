package Project1.Amazon_end_to_end;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Project1.Amazon_end_to_end.*;
import Project1.Amazon_end_to_end.*;

public class TestCase1 extends Amz_Launch_Quit
{
	@Test
	public void login_amazon() throws InterruptedException 
	{
	
	   Amz_Home_Page homep=new Amz_Home_Page(driver);
	   homep.accountandlist(driver);
	   homep.signin();
	
	   Amz_Login_Page loginpage=new Amz_Login_Page(driver);
	   loginpage.login();   
	}

}
