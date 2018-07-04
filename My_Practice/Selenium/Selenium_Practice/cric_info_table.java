package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cric_info_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url="http://www.espncricinfo.com/series/18074/game/1122725/India-vs-Sri-Lanka-3rd-Test-sl-in-india-2017-18/";
	    driver.get(url);
	    for(int i=2;i<=4;i++)
	    {
	    	String s=driver.findElement(By.xpath("//*[@id='main-container']/div/div[3]/div[1]/article[1]/div/table/tbody[1]/tr[1]/td["+ i +"]")).getText();
	   	 System.out.println(s);   

	    }
	    	}

}
