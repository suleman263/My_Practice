package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		int cnt=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr[3]/*")).size();
		System.out.println(cnt);
		int i;
		for(i=1;i<=cnt;i++)
		{
	     	String s=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[3]/td[" + i + "]")).getText();
			System.out.println(s);
		}
	}

}