package Ajax_Controls_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Check_Box_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[2]")).click();;
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]")).click();;
	
	}

}
