import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Flight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
			//Login with Valid User
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("suleman@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("suleman");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Select s1=new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		s1.selectByValue("2");
		Select s2=new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		s2.selectByValue("London");
		Select s3=new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		s3.selectByValue("Paris");
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("shaik");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("suleman");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("7894651212313214");
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
	}

}
