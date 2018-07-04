package Ajax_Controls_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class EnterAlphabet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("TEST");
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.name("userName"))).click().keyDown(Keys.SHIFT).sendKeys("test");
	}

}
