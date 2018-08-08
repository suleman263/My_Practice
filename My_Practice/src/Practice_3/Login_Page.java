package Practice_3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page extends Open_Url {
	public void login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		assertEquals(driver.findElement(By.name("userName")).isDisplayed(), true);
		driver.findElement(By.name("userName")).sendKeys("suleman.shaik121@gmail.com");
		assertEquals(driver.findElement(By.name("password")).isDisplayed(), true);
		driver.findElement(By.name("password")).sendKeys("Hyderabad");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Open_Url ou = new Open_Url();
		ou.openurl_execute();
		ou.exit();*/
		Login_Page lp = new Login_Page();
		lp.login_page();
	}

}
