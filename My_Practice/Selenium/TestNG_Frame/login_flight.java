package TestNG_Frame;

import org.testng.annotations.Test;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class login_flight {
	private static Logger Log = Logger.getLogger(Log.class.getName());
    @DataProvider(name = "Login")
	public static Object[][] dataprovider_user()
	{
		return new Object[][]
				{
			{
				"ssb1","ssb1"
			}
			
				
			
				};
		
	}
@Test(dataProvider="Login")
	public void login(String user,String pwd) {
		// TODO Auto-generated method stub
		 Log.info("New driver instantiated");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Log.info("Send userName");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@alt='Sign-In']")).click();
	}

}
