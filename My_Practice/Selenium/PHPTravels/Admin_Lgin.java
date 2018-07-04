package PHPTravels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_Lgin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://www.phptravels.net/admin";
		WebElement we;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@phptravels.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		List <WebElement> lwe=driver.findElements(By.xpath("//input[@class='checkboxcls']"));
		List <WebElement> lwe1=driver.findElements(By.tagName("a"));
		int cnt,cnt1;
		cnt = lwe.size();
		cnt1=lwe1.size();
		System.out.println(lwe.size());
		int i;
		//for(i=1;i<=cnt;i++)
		//{
			//System.out.println(lwe.get(i).getAttribute("value"));
						 
		//}
		for(i=1;i<=cnt1;i++)
		{
			System.out.println(lwe1.get(i).getAttribute("class"));
		
			 
		}
		  for (WebElement cell: lwe1){
		      //Select 29th Date 
		      if (cell.getClass().equals("xcrud-search-toggle btn btn-default")){
		      cell.findElement(By.tagName("a")).click();		    		  
		    	  
		      
		  }
	//driver.findElement(By.xpath("//a[@class='xcrud-search-toggle btn btn-default' and [@href='javascript:;']]")).click();
		  }
	}

}
