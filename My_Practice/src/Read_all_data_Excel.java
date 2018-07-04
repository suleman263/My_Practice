
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Read_all_data_Excel {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i,j;
		String s;
		FileInputStream fs=new FileInputStream("D:\\Test_Excel.xlsx");
		
		XSSFWorkbook WB=new XSSFWorkbook(fs);
		XSSFSheet sh=WB.getSheet("A");
		int last_row=sh.getLastRowNum();
		System.out.println(last_row);
		for(j=0;j<=3;j++)
		{
			for(i=0;i<=last_row;i++)
			{
						
				XSSFRow r=sh.getRow(i);
				XSSFCell c=r.getCell(j);
				s=c.getStringCellValue();
				System.out.println(s);
				
			}	
		}
		
	
	}

}
