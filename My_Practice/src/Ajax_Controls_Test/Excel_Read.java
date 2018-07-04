package Ajax_Controls_Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		FileInputStream fs=new FileInputStream("D:\\Test_Excel.xlsx");
XSSFWorkbook WB=new XSSFWorkbook(fs);
XSSFSheet sh=WB.getSheet("A");
XSSFRow r=sh.getRow(1);
int last_row=sh.getLastRowNum();
XSSFCell c=r.getCell(1);
String s=c.getStringCellValue();
System.out.println(s);
System.out.println(last_row);
	}

}
