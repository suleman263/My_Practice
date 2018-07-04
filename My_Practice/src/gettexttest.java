import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class gettexttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		a=driver.findElement(By.xpath("//*[@id='wallet_card']/div/p[2]")).getText();
			System.out.println(a);
	}

}
