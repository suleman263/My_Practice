package Selenium_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menu_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/selectable/");
		driver.findElement(By.xpath("//*[@id='ui-id-1']")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='tabs-1']/div")));
		for(i=1;i<=9;i++)
		{
			driver.findElement(By.xpath("//*[@id='selectable']/li[ "+ i + "]")).click();
		}
		
	}

}
