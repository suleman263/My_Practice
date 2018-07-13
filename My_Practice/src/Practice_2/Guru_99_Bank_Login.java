package Practice_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru_99_Bank_Login extends Bank_Constants{
	
	public String path="C:\\Users\\p7165387\\Desktop\\Excel_Data\\Guru_99_Bank.xlsx";
	public WebDriver driver_2;
	public static XSSFWorkbook wb1;
	public static XSSFSheet sh;
	public static XSSFRow r;
	public String title;
	public XSSFCell c1;
	public static String row_data;


public XSSFCell read_data(String sheet,int r1,int c1) throws IOException
{
	  FileInputStream fs=new FileInputStream(path);
	     wb1=new XSSFWorkbook(fs);
	     sh=wb1.getSheet(sheet);
	     r=sh.getRow(r1);
	    XSSFCell c2 = r.getCell(c1);
	    return c2;
	
}
	
public void send_keys(String xpath,String data)
{
	driver_2.findElement(By.xpath(xpath)).sendKeys(data);
	
	if(data=="click")
	{
		driver_2.findElement(By.xpath(xpath)).click();
	}
	
	this.title=driver_2.getTitle();
	System.out.println(title);
}

public void get_table_data_customer(String xpath)
{
	String temp=driver_2.findElement(By.xpath(xpath)).getText();
	System.out.println(temp);
	Guru_99_Bank_Login.row_data=temp;
	
}

public String title_page()
{
	String title_2;
	title_2=this.title;
	
	return title_2;
	
}
public void open_url(String url)
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	this.driver_2=driver;
	
}


public void write_data(String result,int r1,int col) throws IOException
{
r=sh.getRow(r1);
Cell cell= r.createCell(col);
cell.setCellValue(result);
   FileOutputStream fileOut = new FileOutputStream(path);
   wb1.write(fileOut);
   fileOut.flush();
fileOut.close();
}

public void write_data_1(String sh11,String result,int r1,int col) throws IOException
{
	 FileInputStream fs=new FileInputStream(path);
     wb1=new XSSFWorkbook(fs);
     sh=wb1.getSheet(sh11);	
r=sh.getRow(r1);
Cell cell= r.createCell(col);
cell.setCellValue(result);
   FileOutputStream fileOut = new FileOutputStream(path);
   wb1.write(fileOut);
   fileOut.flush();
fileOut.close();
}

public String email_id()
{
	String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 10) { // length of the random string.
        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
        salt.append(SALTCHARS.charAt(index));
    }
    String str1= "@gmail.com";;
	String saltStr = salt.toString() + str1;
     saltStr.concat(str1);
    return saltStr;	
}
public int compare_data(String Exp,String Act)
{
	int result = Exp.compareTo(Act);
	System.out.println(result);
	return result;
	
}
public void click_link()
{
	driver_2.findElement(By.tagName("Manager")).click();
}
	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		// TODO Auto-generated method stub
		XSSFCell v_c;
		Guru_99_Bank_Login g=new Guru_99_Bank_Login();
		v_c=g.read_data("Login",1, 0);
		System.out.println(g.read_data("Login",1, 0));
		DataFormatter df=new DataFormatter();
		String s=df.formatCellValue(v_c);
		System.out.println(s);
		g.open_url(s);
		v_c=g.read_data("Login",1, 1);
		String s1=df.formatCellValue(v_c);
		g.send_keys(id, s1);
		Thread.sleep(800);	
		v_c=g.read_data("Login",1, 2);
		String s2=df.formatCellValue(v_c);
		g.send_keys(pwd, s2);
		Thread.sleep(800);	
		g.send_keys(login, "click");
		//Read the Expected data 
		v_c=g.read_data("Login",1, 3);
		String exp=df.formatCellValue(v_c);
		//Get the Actual Title
		String title_actual=g.title_page();
		//Write the actual data in Excel
		System.out.println(title_actual);
		g.write_data(title_actual, 1, 4);
		String title_expected=df.formatCellValue(v_c);
		System.out.println(title_expected);
		int res=g.compare_data(title_expected, title_actual);
		System.out.println(res);
		if(res==0)
		{
			g.write_data("Pass", 1, 5);
		}
		else if(res==1)
		{
			g.write_data("Fail", 1, 5);
		}
		v_c=g.read_data("New_Customer",1, 0);
		String test_case=df.formatCellValue(v_c);
		System.out.println(test_case);
		switch(test_case)
		{
		
		case "TC01":
			//Loop Run
			
			//v_c=g.read_data("New_Customer",1, 14);
			//String temp1=df.formatCellValue(v_c);
			//int foo = Integer.parseInt(temp1);
			//for(int i = 0;i<=foo;i++)
			//{
							
						//New Customer
			
			v_c=g.read_data("New_Customer",1, 1);
			String Flag=df.formatCellValue(v_c);
			if(Flag.contains("Y"))
			{
				System.out.println(Flag);
				g.send_keys(new_customer, "click");
				//customer_name
				v_c=g.read_data("New_Customer",1, 2);
				String cname_1=df.formatCellValue(v_c);
				g.send_keys(cname, cname_1);
				
				g.send_keys(dob, "01011985");
				
				Thread.sleep(800);				
				//address
				v_c=g.read_data("New_Customer",1, 5);
				String add_1=df.formatCellValue(v_c);
				g.send_keys(addr, add_1);
				
				Thread.sleep(800);	
				//city
				
				v_c=g.read_data("New_Customer",1, 6);
				String city_1=df.formatCellValue(v_c);
				g.send_keys(city, city_1);
				
				Thread.sleep(800);	
				//state
				v_c=g.read_data("New_Customer",1, 7);
				String state_1=df.formatCellValue(v_c);
				g.send_keys(state, state_1);
				
				Thread.sleep(800);	
				//PIN
				v_c=g.read_data("New_Customer",1, 8);
				String pin_1=df.formatCellValue(v_c);
				g.send_keys(pincode, pin_1);
				
				Thread.sleep(800);	
				
				
				//Mobile No
				v_c=g.read_data("New_Customer",1, 9);
				String mobileno=df.formatCellValue(v_c);
				g.send_keys(phone, mobileno);
				
				Thread.sleep(800);	
				
				//email
				//v_c=g.read_data("New_Customer",1, 10);
				//String email_1=df.formatCellValue(v_c);
			//	g.send_keys(email, email_1);
				String email_id_1=g.email_id();
				g.send_keys(email,email_id_1);
				Thread.sleep(800);	
				
				//password
				v_c=g.read_data("New_Customer",1, 11);
				String password_1=df.formatCellValue(v_c);
				g.send_keys(password, password_1);
				
				//submit
				g.send_keys(submit, "click");
				
				Thread.sleep(800);	
				
				g.write_data("Pass", 1, 12);
				
				g.get_table_data_customer("//*[@id='customer']/tbody/tr[4]/td[2]");
				
				g.write_data_1("New_Customer",row_data, 1, 13);
				
				g.write_data_1("TDRow",row_data, 1, 3);
				
				//g.write_data_1("Customers",row_data, i, 0);
			}
				
			//}
			
		case "TC02":
		{
			//Account Creation
			v_c=g.read_data("New_Customer",3, 1);
			String Flag_1=df.formatCellValue(v_c);
			if(Flag_1.contains("Y"))
			{
				System.out.println(Flag_1);
				g.send_keys(new_accnt, "click");
				
				//Customer_id
				v_c=g.read_data("New_Customer",3, 2);
				String TDRow=df.formatCellValue(v_c);
				int r_1=Integer.parseInt(TDRow);
				v_c=g.read_data("TDRow",r_1, 3);
				//String customer_1=df.formatCellValue(v_c);
				
				//Read the data from the newcustomer tab
				
				v_c=g.read_data("New_Customer",1, 13);
				String customer_2=df.formatCellValue(v_c);
				
				g.send_keys(customer, customer_2);
				Thread.sleep(2000);
				v_c=g.read_data("TDRow",r_1, 4);
				String deposit_1=df.formatCellValue(v_c);
				g.send_keys(deposit, deposit_1);
				g.send_keys(button, "click");
				g.write_data_1("New_Customer","Pass", 3, 3);
				
				
                g.get_table_data_customer("//*[@id='account']/tbody/tr[4]/td[2]");
				
                System.out.println(row_data);
                
				g.write_data_1("New_Customer",row_data,3,4);
				
				g.write_data_1("TDRow",row_data,3,3);
		      }
			
			
		}
		case "TC03":
		{
			v_c=g.read_data("New_Customer",4, 1);
			String Flag_1=df.formatCellValue(v_c);
			if(Flag_1.contains("Y"))
			{
				//Read the Account No from  TC01
				v_c=g.read_data("TDRow",3, 3);
				String Accnt_no=df.formatCellValue(v_c);
				g.write_data_1("TDRow",Accnt_no,5,3);
				g.send_keys(withdraw, "click");
				//Read the testdata row from Newcustomer
				XSSFCell v_c_1=g.read_data("New_Customer",4, 2);
				String td_row=df.formatCellValue(v_c_1);
				int td_row_1=Integer.parseInt(td_row);  
				System.out.println(td_row_1);
				//Read the account number and the amount
				v_c=g.read_data("TDRow",td_row_1, 3);
				String Accnt_no_1=df.formatCellValue(v_c);
				g.send_keys(acc_no, Accnt_no_1);
				v_c=g.read_data("TDRow",td_row_1, 4);
				String amnt_1=df.formatCellValue(v_c);
				g.send_keys(amnt, amnt_1);
				v_c=g.read_data("TDRow",td_row_1, 5);
				String desc_1=df.formatCellValue(v_c);
				g.send_keys(desc, desc_1);
				g.send_keys(submit_1, "click");
				g.write_data_1("New_Customer","Pass", 4, 3);
			}
		}
		}
	

}
}
