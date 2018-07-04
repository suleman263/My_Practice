package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_html_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		int cnt=driver.findElements(By.tagName("a")).size();
		for (int i = 1;i<=cnt;i++)
		{
		String w1=driver.findElements(By.tagName("a")).get(i).getText();
		System.out.println(w1);
		}
		
		
	}

}
