package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_check_boxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		String s1;
		int i;
		for(i=1;i<=5;i++)
		{
			//s1=driver.findElement(By.xpath("//*[@id='exp-0']")).getAttribute("value");
			s1=driver.findElement(By.xpath("//*[@id='exp-"+ i + "']")).getAttribute("value");
			System.out.println(s1);
		}
	}

}
