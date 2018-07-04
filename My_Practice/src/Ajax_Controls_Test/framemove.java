package Ajax_Controls_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class framemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("draggable")));
		WebDriver w1=driver.switchTo().frame(driver.findElement(By.id("draggable")));
		System.out.println(w1);
	}

}
