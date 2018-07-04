package Java_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://demos.telerik.com/kendo-ui/datetimepicker/index";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String xpath="//*[@id='example']/div/span/span/span[2]/span[1]/span";
		WebElement we=driver.findElement(By.xpath(xpath));
		//Thread.sleep(4000);
	
		//we.sendKeys("05051985");
		we.click();
		List<WebElement> tr=driver.findElements(By.tagName("tr"));
		List<WebElement> td=driver.findElements(By.tagName("td"));
		int rows,col,i;
		rows=tr.size();
		col=td.size();	
		driver.findElement(By.xpath("//*[@data-value='2018/6/26']")).click();;
		
		
	}

}
