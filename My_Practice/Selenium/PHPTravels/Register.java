package PHPTravels;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register extends php_constants{
  WebDriver driver_1;
  List<WebElement> links;
  	public void open_url()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		this.driver_1=driver;
	}
	public String read_data(int r1,int col) throws IOException
	{
		FileInputStream fs=new FileInputStream(path);
	     wb1=new XSSFWorkbook(fs);
	     sh=wb1.getSheet("Register");
	     r=sh.getRow(r1);
	    c1=r.getCell(col);
	    return c1.getStringCellValue();
	}
	
	public XSSFCell read_cell_data(int r1,int col) throws IOException
	{
		FileInputStream fs=new FileInputStream(path);
	     wb1=new XSSFWorkbook(fs);
	     sh=wb1.getSheet("Register");
	     r=sh.getRow(r1);
	     XSSFCell c1=r.getCell(col);
	    return c1;
	}
	public void send_data(String xpath,String data)
	{
	if(data=="click")
	{
		driver_1.findElement(By.xpath(xpath)).click();
	}
		driver_1.findElement(By.xpath(xpath)).sendKeys(data);  	
		
	}
	public void tag_test()
	{
		int i,c;
		c= driver_1.findElements(By.tagName("a")).size();
		links=driver_1.findElements(By.tagName("a"));
		for(WebElement link : links)
		{
			if(link.getText()=="Rendezvous Hotels");
			link.click();
		}
		System.out.println(c);
	}
	public void open_url_desire(String d_url)
	{
		driver_1.get(d_url);
		driver_1.manage().window().maximize();
	}
	public void partial_link_click(String text)
	{
		driver_1.findElement(By.partialLinkText(text)).click();
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Register r=new Register();
		r.open_url();
		r.send_data(fname, r.read_data(1, 0));
		r.send_data(lname, r.read_data(1, 1));
		XSSFCell s1=r.read_cell_data(1, 2);
		DataFormatter fmt = new DataFormatter();
		String value = fmt.formatCellValue(s1);
		r.send_data(phoneno,value);
		r.send_data(email, r.read_data(1, 3));
		r.send_data(pwd, r.read_data(1, 4));
		r.send_data(cpwd, r.read_data(1, 5));
		r.send_data(signup, "click");
		Thread.sleep(2000);
		r.open_url_desire("https://www.phptravels.net/hotels");
		r.partial_link_click(hotel_name);
		Thread.sleep(9000);
		r.send_data(Book, "click");
		//r.tag_test();
	}

}
