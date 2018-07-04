import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptconfirm.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@onclick='confirmation()']")).click();
		driver.switchTo().alert().accept();
			}

}
