import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Ajax_Controls_Test.Excel_Data_Read_v3;

public class TestNG_Excel_data_provider2_v2 extends Excel_Data_Read_v3{
	String usr,pwd,mix;
	int i,r_cnt;
	
	@DataProvider(name = "create")
	public Object[][] get_data_1() throws IOException
	{
		Excel_Data_Read_v3 E1=new Excel_Data_Read_v3();
		E1.init_excel("C:\\Users\\p7165387\\Desktop\\Test_data.xlsx","Login" );
		r_cnt=E1.get_row_count();
		//r_cnt=r_cnt+1;
		Object[][] data = new Object[4][2];
		for(i=0;i<r_cnt;i++)
		{
			usr=E1.get_data(i+1,0);
			pwd=E1.get_data(i+1,1);
			data[i][i]=usr;
			data[i][i+1]=pwd;
			
		}
			
		return data;	
		
	}
		
	
	@Test(dataProvider = "create")
	public void get_data(String s1,String s2)
	{
	System.out.println(s1);	
	System.out.println(s2);	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(s1);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s2);
	driver.findElement(By.xpath("//input[@alt='Sign-In']")).click();
	driver.close();

	}

}
