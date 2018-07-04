package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();				
			    driver.get("http://toolsqa.com/automation-practice-table/");
                String s=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[2]/th")).getText();
System.out.println(s);
for(int j=1;j<=3;j++)
{
	

			for(int i = 1;i<=3;i++)
			{
				String s1=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+ j +"]/td["+ i +"]")).getText();
				System.out.println(s1);
			}
			
	}
	}

}
