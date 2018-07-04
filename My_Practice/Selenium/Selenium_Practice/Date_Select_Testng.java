package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Date_Select_Testng {
   	@Test
	public void date_select_testng() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
		WebElement wb=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> r=wb.findElements(By.tagName("tr"));
		List<WebElement> c=wb.findElements(By.tagName("td"));
		int r1,c1;
		r1=r.size();
		c1=c.size();
		System.out.println(r1);
		System.out.println(c1);
		for (WebElement cell: c){
			   //Select 29th Date 
			   if (cell.getText().equals("31")){
			   cell.findElement(By.linkText("31")).click();
			   break;
		}
		}
	}
}
