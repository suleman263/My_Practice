package Ajax_Controls_Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class frame_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,c;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		WebElement table=driver.findElement(By.className("ui-datepicker-calendar"));
		c=table.findElements(By.tagName("td")).size();
		System.out.println(c);
		for(i=0;i<=c;i++)
		{
			System.out.println(table.findElements(By.tagName("td")).get(i).getText());	
			if(table.findElements(By.tagName("td")).get(i).getText().equals("28"))
			{
				table.findElement(By.linkText("29")).click();
			}
		}
		
		
		
	}

}
