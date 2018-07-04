
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test_Chrome {
 
	 	
		public static void main(String[] args) {
	 	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	 	
	driver.get("http://newtours.demoaut.com/");
	 
	// Maximize browser
	 
	driver.manage().window().maximize();
	//driver.findElement(By.name("q")).sendKeys("http://newtours.demoaut.com/");
	//driver.findElement(By.id("lst-ib")).sendKeys("http://newtours.demoaut.com/");
	//driver.findElement(By.name("btnK")).click();
     driver.findElement(By.name("login")).click();
     driver.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();
    // driver.findElement(By.partialLinkText("registration form")).click();
     driver.findElement(By.name("firstName")).sendKeys("shaik");
     driver.findElement(By.name("lastName")).sendKeys("shaik");
     driver.findElement(By.name("phone")).sendKeys("859865125");
     driver.findElement(By.name("userName")).sendKeys("shaik@gmail.com");
     driver.findElement(By.name("address1")).sendKeys("test");
     driver.findElement(By.name("address2")).sendKeys("test");
     driver.findElement(By.name("city")).sendKeys("Hyderabad");
     driver.findElement(By.name("state")).sendKeys("AP");
     driver.findElement(By.name("postalCode")).sendKeys("500033");
    Select s=new Select(driver.findElement(By.name("country")));
    s.selectByValue("42");
    driver.findElement(By.name("email")).sendKeys("Hyderabad");
    driver.findElement(By.name("password")).sendKeys("Hyderabad");
    driver.findElement(By.name("confirmPassword")).sendKeys("Hyderabad");
    driver.findElement(By.name("register")).click();
    driver.findElement(By.xpath("//a[@href='mercurysignon.php']")).click();
    driver.findElement(By.name("userName")).sendKeys("shaik@gmail.com");
    driver.findElement(By.name("password")).sendKeys("Hyderabad");
    driver.findElement(By.name("login")).click();
    
				}

		
}
