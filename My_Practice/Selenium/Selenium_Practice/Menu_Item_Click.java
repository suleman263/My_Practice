package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menu_Item_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/selectable/");
		driver.findElement(By.xpath("//*[@id='ui-id-2']")).click();
		for(i=1;i<=12;i++)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='selectable_grid']/li[" + i + "]")).click();
		}
		
		
	}

}
