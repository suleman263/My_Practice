package test_code;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test_code {
	public String path="C:\\Users\\p7165387\\Desktop\\Excel_Data\\Read_Excel.xlsx";
	public static XSSFWorkbook wb1;
	public static XSSFSheet sh;
	public static XSSFRow r;
	public XSSFCell c1;
	public int r_cnt;
	public String read_data(int r1,int col) throws IOException
    {
     FileInputStream fs=new FileInputStream(path);
     wb1=new XSSFWorkbook(fs);
      sh=wb1.getSheet("A");
       r=sh.getRow(r1);
     DataFormatter formatter = new DataFormatter();
    String c1=formatter.formatCellValue(r.getCell(col));
    return c1;
    }
	
	 public XSSFCell read_data_1(int r1,int col) throws IOException
	    {
	     FileInputStream fs=new FileInputStream(path);
	     wb1=new XSSFWorkbook(fs);
	      sh=wb1.getSheet("A");
	         r=sh.getRow(r1);
	    XSSFCell cl=r.getCell(col);
	     //DataFormatter formatter = new DataFormatter();
	    //@SuppressWarnings("unused");
	    //String c1=formatter.formatCellValue(r.getCell(col));
	       return cl;
	    }
	
	public int r_cnt() throws IOException
	{
		FileInputStream fs=new FileInputStream(path);
	     wb1=new XSSFWorkbook(fs);
	      sh=wb1.getSheet("A");
		return sh.getLastRowNum();
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		test_code tc=new test_code();
		String s;
		XSSFCell s1;
		int cnt,i;
		cnt=tc.r_cnt();
		System.out.println(cnt);
		/*for(i=0;i<=cnt;i++)
		{
			s=tc.read_data(i, 0);
			System.out.println(s);
			
		}*/
		Thread.sleep(2000);
		for(i=0;i<=cnt;i++)
		{
			s1=tc.read_data_1(i, 0);
			System.out.println(s1);
			
		}
		
	}

}
