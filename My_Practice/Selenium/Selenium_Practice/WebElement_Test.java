package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		WebElement w=driver.findElement(By.xpath("//*[@id='content']/h1"));
		
		System.out.println("WebElement is having --->" + w + w.getText());

		//List of WebElemets
		int i;
		for (i=1;i<=4;i++)
		{
		List<WebElement> w1=driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr["+ i +"]/td[1]"));
		System.out.println(w1);
		
		}
	}



}
