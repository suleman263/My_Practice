package Selenium_Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		//*[@id="content"]/p[3]/button
	}

}
