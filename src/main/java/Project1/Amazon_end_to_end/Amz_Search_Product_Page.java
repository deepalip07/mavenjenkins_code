package Project1.Amazon_end_to_end;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Search_Product_Page 
{
	@FindBy(id="twotabsearchtextbox")
	WebElement search_product_text;
	
	@FindBy(xpath="//div[@class='s-suggestion-container']")
	List<WebElement> auto_suggestion;
	
	
	public void search_product()
	{
		search_product_text.sendKeys("android mobile");
		
	}
	
	public void auto_sugestion() throws InterruptedException
	{
		List<WebElement> e=auto_suggestion;
		 int count =e.size();
		 System.out.println(count);
		 Thread.sleep(5000);
		 e.get(2).click();
	}
	
	public Amz_Search_Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



}
