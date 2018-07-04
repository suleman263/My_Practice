package Selenium_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_test_Properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://toolsqa.com/automation-practice-table/");
		Properties p=new Properties();
		FileInputStream fs=new FileInputStream("D:\\Eclipse_WorkSpace\\My_Practice\\Selenium\\Selenium_Practice\\url_account_properties");
			p.load(fs);
		driver.get(p.getProperty("url"));
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