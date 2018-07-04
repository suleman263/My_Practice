package Ajax_Controls_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Accept_Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#accepted-elements");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		WebElement W1=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement W2=driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(W1, W2).build().perform();
		
	}

}
