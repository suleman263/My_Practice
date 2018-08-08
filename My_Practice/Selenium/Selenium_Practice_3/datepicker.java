package Selenium_Practice_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/datepicker/");
		driver.findElement(By.id("ui-id-2")).click();
		WebElement we,date_1,table;
		int i;
		we=driver.findElement(By.id("anim"));
		Select s=new Select(we);
		Thread.sleep(4000);
		s.selectByVisibleText("Clip (UI Effect)");
		date_1=driver.findElement(By.id("datepicker2"));
		date_1.click();
		table=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> r=table.findElements(By.tagName("td"));
		System.out.println(r.size());
		for(WebElement w:r)
		{
			System.out.println(w.getText());
			  if (w.getText().equals("15")){
			      w.findElement(By.linkText("15")).click();
			      break;
		}
		
		}
	}

}
