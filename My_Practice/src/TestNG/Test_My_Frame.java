package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test_My_Frame extends Init_class {

	
	
	//public static void main(String[] args) 
	@Test
	public void register()
	{
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty(wb,cloc);
		ChromeDriver driver = new ChromeDriver();
		driver.get(s);
		driver.manage().window().maximize();
			//Login with Valid User
		driver.findElement(By.xpath(username_1)).sendKeys("suleman@gmail.com");
		driver.findElement(By.xpath(password_1)).sendKeys("suleman");
		driver.findElement(By.xpath(Login)).click();
		driver.findElement(By.xpath(oneway)).click();
		Select s1=new Select(driver.findElement(By.xpath(passcount)));
		s1.selectByValue("2");
		Select s2=new Select(driver.findElement(By.xpath(fromport)));
		s2.selectByValue("London");
		Select s3=new Select(driver.findElement(By.xpath(toport)));
		s3.selectByValue("Paris");
		driver.findElement(By.xpath(findflights)).click();
		driver.findElement(By.xpath(reserveFlights)).click();
		driver.findElement(By.xpath(fname)).sendKeys("shaik");
		driver.findElement(By.xpath(lname)).sendKeys("suleman");
		driver.findElement(By.xpath(cc)).sendKeys("7894651212313214");
		driver.findElement(By.xpath(buy)).click();
		driver.findElement(By.xpath(logout)).click();
	

}
}
