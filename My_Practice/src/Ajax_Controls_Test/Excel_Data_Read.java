package Ajax_Controls_Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data_Read {
	
	

	public void get_data(String Path,String Sheet) throws IOException
	{
		 //String path1 = "C:\\Users\\p7165387\\Desktop\\Test_data.xlsx";
		 FileInputStream fs=new FileInputStream(Path);
		 @SuppressWarnings("resource")
		 XSSFWorkbook wb=new XSSFWorkbook(fs);
		 XSSFSheet sh=wb.getSheet("Login");
		 int last_row,c,i;
		 last_row=sh.getLastRowNum();
		 System.out.println("Total Number of Rows =" + last_row);
		 for(i=1;i<=last_row;i++)
		 {

		 XSSFRow r=sh.getRow(i);
		 for(c=0;c<=1;c++)
		 {
		 XSSFCell cl=r.getCell(c);
		 String s=cl.getStringCellValue();
		 //tabArray[i][c]=cl.getStringCellValue();
		 System.out.println(s);
		 
		 
		 //System.out.println(tabArray[i][c]);
		 }
		 	}
		 			 
	
	
		
	}
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
					
		Excel_Data_Read E1=new Excel_Data_Read();
		E1.get_data("C:\\Users\\p7165387\\Desktop\\Test_data.xlsx","Login" );
			
	}
}

