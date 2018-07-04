package Selenium_Practice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_box_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://toolsqa.com/automation-practice-form/";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement> l =driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println(l.size());
        for(WebElement w:l)
        {
        	w.click();
        	System.out.println(l.size());
  System.out.println(w.getAttribute("value"));
        }
	}

}
