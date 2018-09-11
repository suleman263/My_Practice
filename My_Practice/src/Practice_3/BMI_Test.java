package Practice_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BMI_Test extends BMI_OR{
WebDriver driver_2;



	public void open_url(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		this.driver_2=driver;
		
	}
	
	public void send_data(String xpath,String data)
	{
		if(data=="click")
		{
			driver_2.findElement(By.xpath(xpath)).click();
		}
		driver_2.findElement(By.xpath(xpath)).sendKeys(data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://cookbook.seleniumacademy.com/mobilebmicalculator.html";
		BMI_Test BT=new BMI_Test();
		BT.open_url(url);
		BT.send_data(height, "123");
		BT.send_data(weight, "200");
		BT.send_data(calculate, "click");
	}

}
