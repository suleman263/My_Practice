package Selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Take_Screen_Shot {

	private static Files Fileutils;
	@SuppressWarnings("static-access")
	public void take_screen_shot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Fileutils.copy(src, new File("D:\\error.png"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Take_Screen_Shot ss=new Take_Screen_Shot();
		ss.take_screen_shot();

	}

}
