package Practice_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Url {
	WebDriver driver_1;
public void openurl_execute()
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	driver.manage().window().maximize();
	this.driver_1=driver;
}
public void exit()
{
	driver_1.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Open_Url ou=new Open_Url();
		ou.openurl_execute();
		
	}

}
