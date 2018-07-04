package Live_Oracle_cloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Live_Sql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://login.oracle.com/oaam_server/login.do";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("suleman.shaik1836@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Arshiya1905!");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
