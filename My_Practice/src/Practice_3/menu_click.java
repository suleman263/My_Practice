package Practice_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class menu_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="http://demoqa.com/menu/";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement sm=driver.findElement(By.xpath("//*[@id='ui-id-1']"));
		sm.click();
		Thread.sleep(2000);
		WebElement msm=driver.findElement(By.xpath("//*[@id='ui-id-2']"));
		msm.click();
		List<WebElement> itm=driver.findElements(By.tagName("a"));
		for(WebElement w:itm)
		{
			System.out.println(w.getAttribute("href"));
		}
		
		WebElement Par;
		Par=driver.findElement(By.partialLinkText("New"));
		Par.click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("FAQ")).click();
	}

}
