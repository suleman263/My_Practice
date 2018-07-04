
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test_Chrome_TestNG {
 
	 	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@alt='Sign-In']")).click();
			driver.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("99887744556");
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("suleman");
			Select s=new Select(driver.findElement(By.xpath("//select[@name='country']")));
			s.selectByValue("2");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suleman@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='register']")).click();
			driver.findElement(By.xpath("//a[@href='mercurysignon.php']")).click();
			//Login with Valid User
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("suleman@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("suleman");
			driver.findElement(By.xpath("//input[@name='login']")).click();
			driver.findElement(By.xpath("//input[@value='oneway']")).click();
			Select s1=new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
			s1.selectByValue("3");
			Select s2=new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
			s2.selectByValue("London");
			Select s3=new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
			s3.selectByValue("Paris");
			driver.findElement(By.xpath("//input[@name='findFlights']")).click();


    
				}

		
}
