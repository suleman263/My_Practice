package Ajax_Controls_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		WebElement w1=driver.findElement(By.id("draggable"));
		WebElement w2=driver.findElement(By.id("droppable"));
		Actions a= new Actions (driver);
		a.dragAndDrop(w1,w2).build().perform();
					
	}

}
