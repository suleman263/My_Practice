package Ajax_Controls_Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Data_Read_v3 {
	
	
   public static XSSFWorkbook wb;
   public static XSSFSheet sh;
   public static XSSFRow r;
   public XSSFCell cl;
   
   String data,cell_data;
   int r_count;
   //Setting the path of the file 
   public void init_excel(String path,String sheet) throws IOException
   {
	   
		   FileInputStream fs=new FileInputStream(path);
		   wb=new XSSFWorkbook(fs);
		   sh=wb.getSheet(sheet);  
		   
		   
   }
	public String get_data(int r1,int col) throws IOException
	{
		 r=sh.getRow(r1);
		 cl=r.getCell(col);
		 String s=cl.getStringCellValue();
		 //tabArray[i][c]=cl.getStringCellValue();
		 System.out.println(s);
		 this.data=s;
		 		return s; 
		 //System.out.println(tabArray[i][c]);			 
			
	}
	public void cell_data()
	{
		cell_data=data;
		System.out.println(cell_data);
	}
	public void write_data(String result,int r1,int col) throws IOException
	{
		
		r=sh.getRow(r1);
		Cell cell= r.createCell(col);
		cell.setCellValue(result);
   		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\p7165387\\Desktop\\Test_data.xlsx");
	    wb.write(fileOut);
	    fileOut.flush();
		fileOut.close();
	}
	
	public int get_row_count()
	{
		r_count=sh.getLastRowNum();
		System.out.println(r_count);
		return r_count;
	}
	
		public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
					
		Excel_Data_Read_v3 E1=new Excel_Data_Read_v3();
		E1.init_excel("C:\\Users\\p7165387\\Desktop\\Test_data.xlsx","Login" );
		String usr,pwd;
		
			usr=E1.get_data(1,0); 
			pwd=E1.get_data(1,1); 
			E1.get_row_count();
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurysignon.php");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(usr);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@name='login']")).click();
			if(driver.findElement(By.xpath("//input[@name='findFlights']")).isEnabled())
			{
				E1.write_data("Pass",1,2);
			}					
							
	}
}

