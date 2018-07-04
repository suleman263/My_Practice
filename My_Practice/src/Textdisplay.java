import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Textdisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//label[@for='switch__input_2']")).click();
		boolean a=driver.findElement(By.xpath("//input[@mt-id='returnDate']")).isSelected();
	System.out.println(a);
	
	}

}
