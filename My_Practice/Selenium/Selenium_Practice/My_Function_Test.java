package Selenium_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My_Function_Test {
	WebDriver d1;
	public void perform_test_sendkeys(String path_1,String Key)
	{
		
		d1.findElement(By.xpath(path_1)).sendKeys(Key);
	}
	
	public void perform_test_click(String path_1)
	
	{
		d1.findElement(By.xpath(path_1)).click();
	}
	public void perform_test_select(String path_1,String text)
	{
		Select s=new Select(d1.findElement(By.xpath(path_1)));
		s.selectByVisibleText(text);
	}
	public void open_url()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		this.d1=driver;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		My_Function_Test T=new My_Function_Test();
		T.open_url();
		T.perform_test_sendkeys("//input[@ng-model='FirstName']", "abc");
		T.perform_test_sendkeys("//input[@ng-model='LastName']", "def");
		T.perform_test_sendkeys("//textarea[@ng-model='Adress']", "Hyderabad");
		T.perform_test_sendkeys("//input[@ng-model='EmailAdress']", "abc.def@gmail.com");
		T.perform_test_sendkeys("//input[@ng-model='Phone']", "9878512451");
		T.perform_test_click("//input[@value='Male']");
		T.perform_test_click("//*[@id='checkbox1']");
		T.perform_test_select("//select[@id='Skills']", "C");
		T.perform_test_select("//select[@id='countries']", "India");
		T.perform_test_select("//select[@id='yearbox']", "1999");
		T.perform_test_select("//select[@placeholder='Day']", "19");
		T.perform_test_select("//select[@placeholder='Month']", "5");
		T.perform_test_sendkeys("//input[@ng-model='Password']", "Test123!");
		T.perform_test_sendkeys("//input[@ng-model='CPassword']", "Test123!");
		T.perform_test_click("//button[@name='signup']");
		
	}
}
