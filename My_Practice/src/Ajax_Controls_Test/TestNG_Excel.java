package Ajax_Controls_Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Excel extends Excel_Data_Read_v3{
	WebDriver wd1;
	@BeforeTest()
	public void open_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		this.wd1=driver;
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
	}
	@Test()
	public void login() throws IOException
	{
		Excel_Data_Read_v3 E1=new Excel_Data_Read_v3();
		E1.init_excel("C:\\Users\\p7165387\\Desktop\\Test_data.xlsx","Login" );
		String usr,pwd;
		int i,r;
		r=E1.get_row_count();
		System.out.println(r);
		for(i=1;i<=r;i++)
		{
			//usr=E1.get_data(1,0); 
			//pwd=E1.get_data(1,1); 
			usr=E1.get_data(i,0); 
			pwd=E1.get_data(i,1); 
			wd1.findElement(By.xpath("//input[@name='userName']")).sendKeys(usr);
			wd1.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
			wd1.findElement(By.xpath("//input[@name='login']")).click();
			if(wd1.findElement(By.xpath("//input[@name='findFlights']")).isEnabled())
			{
				E1.write_data("Pass",1,2);
			}	
			wd1.close();
		}
		
			
		
	}
	

	
}
