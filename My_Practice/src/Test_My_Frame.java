import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_My_Frame {

	static String s="http://newtours.demoaut.com/";
	static String username_1 = "//input[@name='userName']";
	static String password_1 = "//input[@name='password']";
	static String Login = "//input[@name='login']";
	static String oneway = "//input[@value='oneway']";
	static String passcount = "//select[@name='passCount']";
	static String fromport = "//select[@name='fromPort']";
	static String toport = "//select[@name='toPort']";
	static String findflights =  "//input[@name='findFlights']";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(s);
		driver.manage().window().maximize();
			//Login with Valid User
		driver.findElement(By.xpath(username_1)).sendKeys("suleman@gmail.com");
		driver.findElement(By.xpath(password_1)).sendKeys("suleman");
		driver.findElement(By.xpath(Login)).click();
		driver.findElement(By.xpath(oneway)).click();
		Select s1=new Select(driver.findElement(By.xpath(passcount)));
		s1.selectByValue("2");
		Select s2=new Select(driver.findElement(By.xpath(fromport)));
		s2.selectByValue("London");
		Select s3=new Select(driver.findElement(By.xpath(toport)));
		s3.selectByValue("Paris");
		driver.findElement(By.xpath(findflights)).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("shaik");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("suleman");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("7894651212313214");
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
	}

}
