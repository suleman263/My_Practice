package Practice_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Compare {
	public String path="C:\\Users\\p7165387\\Desktop\\Excel_Data\\Data_Compare.xlsx";
	public static XSSFWorkbook wb1;
	public static XSSFSheet sh;
	public static XSSFRow r;
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
	
	public String compare_data(XSSFCell actual,XSSFCell expected )
	{
		System.out.println(actual);
		System.out.println(expected);
		String result1 = null;
		DataFormatter df=new DataFormatter();
		String actual_1=df.formatCellValue(actual);
		String expected_1=df.formatCellValue(expected);
		
		if(actual_1.equals(expected_1))
		{
			result1="Pass";
		}
		
		return result1;
			
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Data_Compare dc=new Data_Compare();
		//expected
		/*System.out.println(dc.read_data("Data", 0, 3));
		String r=dc.compare_data(dc.read_data("Data", 0, 3), dc.read_data("Data", 1, 3));
		System.out.println(r);
		dc.write_data(r, 2, 1);*/
		
		int i,j;
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=8;j++)
			{
				String r=dc.compare_data(dc.read_data("Data", i, j), dc.read_data("Data", i+1, j));
				System.out.println(r);
				dc.write_data(r, i+2, j);
			}
		}
		
		
		
		
		
		
	}

}
