package Ajax_Controls_Test;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Function_Test {
	void excel_read(String File_Path,String Sheet_Name) throws IOException
	{
		int i,j;
		String s;
		//"D:\\Test_Excel.xlsx"
		FileInputStream fs=new FileInputStream(File_Path);
		@SuppressWarnings("resource")
		XSSFWorkbook WB=new XSSFWorkbook(fs);
		XSSFSheet sh=WB.getSheet(Sheet_Name);
		int last_row=sh.getLastRowNum();
		//ArrayList<String> a=new ArrayList<String>();
		//System.out.println(last_row);
		for (i=1;i<=last_row;i++)
		{
			XSSFRow r=sh.getRow(i);
			//Ignore the header
			for (j=0;j<=2;j++)  
			{
						
				
				XSSFCell c=r.getCell(j);
				s=c.getStringCellValue();
				//user[i][j]=c.getStringCellValue();
				//a.add(s);
				System.out.println(s);
				System.out.println(last_row);
				
				
			}	
		}
		
		
			
			
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Excel_Function_Test E=new Excel_Function_Test();
		E.excel_read("C:\\Users\\p7165387\\Desktop\\Test_Data.xlsx","Login");
		
	}
	

}


