package PHPTravels;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class php_constants {
	
	public String url="https://www.phptravels.net/register";
	public String path="C:\\Users\\p7165387\\Desktop\\Excel_Data\\PHPTravels.xlsx";
	public static XSSFWorkbook wb1;
	public static XSSFSheet sh;
	public static XSSFRow r;
	public XSSFCell c1;
	public static String fname="//input[@name='firstname']";
	public static String lname="//input[@placeholder='Last Name']";
	public static String phoneno="//input[@placeholder='Mobile Number']";
	public static String email="//input[@placeholder='Email']";
	public static String pwd="//input[@placeholder='Password']";
	public static String cpwd="//input[@placeholder='Confirm Password']";
	public static String signup="//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']";
	public static String hotel="//img[@src='https://www.phptravels.net/themes/default/assets/img/icons/hotel.png']";
	public static String hotel_name="Alzer Hotel Istanbul"; 
	public static String Book="//*[@id='ROOMS']/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/button"; 
	
	
}
