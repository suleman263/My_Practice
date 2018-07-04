package Selenium_Practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://jqueryui.com/datepicker/";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement frame_1= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame_1);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		WebElement d=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
		List<WebElement> r=d.findElements(By.tagName("tr"));
		List<WebElement> c=d.findElements(By.tagName("td"));
		System.out.println(r.size());
		System.out.println(c.size());
		for(WebElement c1:c)
		{
			if(c1.getText().equals("28"))
			{
				c1.findElement(By.linkText("28")).click();
			}
		}
	}

}
