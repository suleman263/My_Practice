import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		driver.findElement(By.xpath("//*[@id='js-switch__option']/div[8]/label")).click();
	}

}
