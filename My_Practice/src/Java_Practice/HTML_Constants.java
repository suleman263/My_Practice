package Java_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HTML_Constants {
	public int columns;
	 public final StringBuilder table = new StringBuilder();
	 public static String HTML_START = "<html>";
	 public static String HTML_END = "</html>";
	 public static String TABLE_START_BORDER = "<table border=\"1\">";
	 public static String TABLE_START = "<table>";
	 public static String TABLE_END = "</table>";
	 public static String HEADER_START = "<th>";
	 public static String HEADER_END = "</th>";
	 public static String ROW_START = "<tr>";
	 public static String ROW_END = "</tr>";
	 public static String COLUMN_START = "<td>";
	 public static String COLUMN_END = "</td>";
	 public String path="C:\\Users\\p7165387\\Desktop\\Excel_Data\\KeyWord.xlsx";
	 public static String Path_html="C:\\Users\\p7165387\\Desktop\\Excel_Data\\test.txt";
	 public static XSSFWorkbook wb1;
	 public static XSSFSheet sh;
	 public static XSSFRow r;
	 public XSSFCell c1;
	 public XSSFCell c;
	 
	 public String read_data(int r1,int col) throws IOException
	    {
	     FileInputStream fs=new FileInputStream(path);
	     wb1=new XSSFWorkbook(fs);
	     sh=wb1.getSheet("A");
	     r=sh.getRow(r1);
	    c=r.getCell(col);
	    @SuppressWarnings("unused")
		String s;
		return c.getStringCellValue();

	    }
	 public int last_row()
	 {
		 int last_row = sh.getLastRowNum();
		return last_row;
		 
	 }

}
