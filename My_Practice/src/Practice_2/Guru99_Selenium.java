package Practice_2;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Guru99_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="http://cookbook.seleniumacademy.com/DoubleClickDemo.html";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	  
		/*//Below code for double click
		String url3="http://cookbook.seleniumacademy.com/DoubleClickDemo.html";
		WebElement we=driver.findElement(By.id("message"));
		Actions a=new Actions(driver);
		
			Thread.sleep(1000);
			a.doubleClick(we).build().perform();*/
		
		
		
		
		/*//Print the  table date
		String url1="http://demo.guru99.com/test/table.html";
		List<WebElement> r=driver.findElements(By.tagName("td"));
	    List<WebElement> c=driver.findElements(By.tagName("tr"));
	    System.out.println(r.size());		
	    System.out.println(c.size());    
	    	for(WebElement c1:c)
	    	{
	    		System.out.println(c1.getText());
	    	}*/
	   
	    
	    
		/*List<WebElement> we=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(we.size());
		assertEquals(3, we.size());
		for(WebElement we1:we)
		{
		System.out.println(we1.getAttribute("id"));	
		Thread.sleep(2000);
		if(we1.isSelected())
		{
			
		
		System.out.println("Checked");
		we1.click();
		}
		}
	}
*/
	}
}
