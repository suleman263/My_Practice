package Ajax_Controls_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class mouseovertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=footer_in");
		driver.manage().window().maximize();
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]"))).build().perform();
	}

}
