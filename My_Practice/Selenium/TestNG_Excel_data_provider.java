import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Ajax_Controls_Test.Excel_Data_Read_v3;

public class TestNG_Excel_data_provider extends Excel_Data_Read_v3{
	String usr,pwd,mix;
	
	int i,j,row_cnt;
	
	@DataProvider(name = "create")
	public   Object[][] get_data_excel() throws IOException
	{
		Object[][] data=new Object[2][2];
		Excel_Data_Read_v3 E1=new Excel_Data_Read_v3();
		E1.init_excel("C:\\Users\\p7165387\\Desktop\\Test_data.xlsx","Login" );
		this.row_cnt=E1.get_row_count();
		for(i=1;i<=data.length;i++)
		{
			
			data[i-1][i-1]=E1.get_data(i, 0);
	        data[i-1][i]=E1.get_data(i, 1);
	        
		}
				//data[0][0]=E1.get_data(1, 0);
		        //data[0][1]=E1.get_data(1, 1);
		return data;
			
		
	}
	@Test(dataProvider = "create")
	public void display_data (String s1,String s2)
	{
	System.out.println(s1);	
	System.out.println(s2);	
	System.out.println(row_cnt);

	}
	
	

}
