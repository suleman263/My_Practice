package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int i;
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://demoqa.com/registration/");
				driver.findElement(By.xpath("//*[@id='pie_register']/li[14]/div/input")).click();
				i=driver.findElements(By.xpath("//span[@class='legend error']")).size();
				System.out.println(i);
	};

}
