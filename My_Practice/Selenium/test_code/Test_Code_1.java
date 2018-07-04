package test_code;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Code_1 {
	public static void main(String[] args) 
	{
	String url="http://demo.automationtesting.in/Datepicker.html";
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//img[@src='http://jqueryui.com/resources/demos/datepicker/images/calendar.gif']")).click();
	 WebElement wb=driver.findElement(By.className("ui-datepicker-calendar"));
	 List<WebElement> r=wb.findElements(By.tagName("tr"));
	  List<WebElement> c=wb.findElements(By.tagName("td"));
	  int r1,c1;
	  r1=r.size();
	  c1=c.size();
	  System.out.println(r1);
	  System.out.println(c1);
	  for(int i=0;i<=c1;i++)
	  {
		   wb.findElement(By.partialLinkText("3")).click();
	  }
	}
}
