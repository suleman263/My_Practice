package PHPTravels;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackEnd_Test {
	public static void main(String[] args) throws InterruptedException 
	{
	String url="https://www.phptravels.net/admin";
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@phptravels.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demoadmin");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebElement we = driver.findElement(By.tagName("table"));
	we.getSize();
	
	
	}
}
