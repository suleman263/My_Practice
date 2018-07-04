package Page_object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_OR {
	
	WebDriver driver_1;
	By username=By.xpath("//input[@name='email']");
	public void open_url()
	{
	String url="https://www.phptravels.net/admin";
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	this.driver_1=driver;
	driver.get(url);
	}
	public WebElement user_name()
	{
		return driver_1.findElement(username);		
		
	}
}
