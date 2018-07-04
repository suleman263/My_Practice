package Ajax_Controls_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qtptutorial.net/automation-practice/");
		driver.manage().window().maximize();
				String w1=driver.findElement(By.xpath("//*[@id='htmlTableId']/tbody/tr/th/following-sibling::th[1]")).getText();
				System.out.println(w1);
						
	
	}

}

