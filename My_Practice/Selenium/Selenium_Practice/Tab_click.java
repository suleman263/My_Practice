package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://demoqa.com/");
				int i;
				String s;
				//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='post-9']/div/div[4]")));
				for(i=1;i<6;i++)
				{
					driver.findElement(By.xpath("//*[@id='ui-id-"+ i + "']")).click();
					s=driver.findElement(By.xpath("//*[@id='tabs-"+ i + "']/b")).getText();
					System.out.println(s);
				}
                
	}

}
