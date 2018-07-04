package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
private static WebElement element= null;
	public WebElement first_name(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@ng-model = 'FirstName']"));
		System.out.println(element);
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println("URL is opened");
		Register r=new Register();
		r.first_name(driver).sendKeys("qw");
		
	}

}
