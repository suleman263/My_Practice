package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Register {
	int i;
	String s;
		public void check_all_hobbies(int cnt)
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		for(i=1;i<=cnt;i++)
		{
			s="//*[@id='checkbox"+ i+ "']";
			System.out.println(s);
			driver.findElement(By.xpath(s)).click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test_Register T=new Test_Register();
		T.check_all_hobbies(3);
		
		
	}

}
