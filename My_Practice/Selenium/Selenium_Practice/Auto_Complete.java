package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/AutoComplete.html");
		driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div[1]")).sendKeys("ind");
	}

}
