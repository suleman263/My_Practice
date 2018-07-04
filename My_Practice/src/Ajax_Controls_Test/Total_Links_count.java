package Ajax_Controls_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_Links_count {

	public static void main(String[] args) {
		int cnt,i;
		String c1;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		cnt=(driver.findElements(By.tagName("a")).size());
				System.out.println(cnt);
		for (i=0;i<=cnt;i++)
		{
			c1=driver.findElements(By.tagName("a")).get(i).getText();
			System.out.println(c1);
			
		}
	}

}
