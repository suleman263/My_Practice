package Sample_Registration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_Registration extends Constants_3{

	public String path="C:\\Users\\p7165387\\Desktop\\Excel_Data\\Sample_Registration.xlsx";
	public static XSSFWorkbook wb1;
	public static XSSFSheet sh;
	public static XSSFRow r;
	public XSSFCell c1;
	public WebDriver driver_2;
	
	public XSSFCell read_cell_data(int r1,int col) throws IOException
	 {
	  FileInputStream fs=new FileInputStream(path);
	      wb1=new XSSFWorkbook(fs);
	      sh=wb1.getSheet("Register");
	      r=sh.getRow(r1);
	      XSSFCell c1=r.getCell(col);
	     return c1;
	 }

	public String data_convert(XSSFCell c2)
	{
		  DataFormatter fmt = new DataFormatter();
		  String value = fmt.formatCellValue(c2);
		return value;
	}
	public void send_data(String xpath,String data)
	{
		if(data.contentEquals("click"))
		{
			driver_2.findElement(By.xpath(xpath)).click();	
		}
		driver_2.findElement(By.xpath(xpath)).sendKeys(data);
	}
	public void select(String xpath,String data_1)
	{
		Select s=new Select(driver_2.findElement(By.xpath(xpath)));
		s.selectByVisibleText(data_1);
	}
	public void open_url()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		this.driver_2=driver;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Sample_Registration s=new Sample_Registration();
		s.open_url();
		XSSFCell c3;
		String s1;
		c3=s.read_cell_data(1, 0);
		System.out.println(c3);
		s1=s.data_convert(c3);
		s.send_data(first_name, s1);
		c3=s.read_cell_data(1, 1);
		System.out.println(c3);
		String s21=s.data_convert(c3);
		s.send_data(last_name, s21);
		s.send_data(status, "click");
		s.send_data(hobby,"click");
		s.select(cntry, "India");
		s.select(day, "12");
		s.select(month, "5");
		s.select(year, "1985");
		s.send_data(phone_number, "9874563210");
		s.send_data(username, "test12123");
		s.send_data(email, "tes1212t@gmail.com");
		s.send_data(password, "78965412");
		s.send_data(cpassword, "78965412");
		s.send_data(submit, "click");
	}

}
