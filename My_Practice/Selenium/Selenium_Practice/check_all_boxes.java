package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_all_boxes {

	public static void main(String[] args) {
		int i;
		 List<WebElement> lw; 
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("http://toolsqa.com/automation-practice-form/");
       lw=driver.findElements(By.xpath("//input[@type='radio']"));
       System.out.println(lw.size());
       for(i=1;i<=lw.size();i++)
       {
    	   System.out.println(lw.get(i).getClass());
       }
	}

}
