import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class dynamic_selection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		//		driver.findElement(By.className("wHuges station ddlfromto formSelect CustomizableDD required")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		
		 
		// Maximize browser
		 driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		
	}

}
