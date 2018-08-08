package Practice_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class Excel_Iterator {
	public static String path="C:\\Users\\p7165387\\Desktop\\Excel_Data\\Guru_99_Bank.xlsx";
	public WebDriver driver_2;
	public static XSSFWorkbook wb1;
	public static XSSFSheet sh;
	public static XSSFRow r;
	public String title;
	public static XSSFCell c1;

	public static void main(String[] args) throws IOException {
		
			
		
		 FileInputStream fs=new FileInputStream(path);
	     wb1=new XSSFWorkbook(fs);
	     sh=wb1.getSheet("New_Customer");
	     int cnt=sh.getLastRowNum();
	   
	     System.out.println(cnt);
	     
		
		System.out.println(r.getPhysicalNumberOfCells());
		 
		/*String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};
		for(String tmp:arrData)
		{
			System.out.println(tmp.length());
			System.out.println(tmp);
		}*/
	}

}
