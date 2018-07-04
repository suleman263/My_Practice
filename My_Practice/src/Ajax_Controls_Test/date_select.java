package Ajax_Controls_Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/menu/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		driver.findElement(By.xpath("//*[@id='ui-id-9']")).click();
		//driver.findElements(By.xpath("//*[@id='menu']/li[6]/ul"));	
		driver.findElement(By.xpath("//*[@aria-activedescendant='ui-id-10']")).click();
		
	}

}
