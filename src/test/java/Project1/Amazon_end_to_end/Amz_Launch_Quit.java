package Project1.Amazon_end_to_end;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Amz_Launch_Quit 
{
ChromeDriver driver=new ChromeDriver();
	
	@BeforeMethod()
	public void Amz_launch() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(5000);
		
	}

}
