import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	 	
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys ("Hi");
	}

}
