package Java_Practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLTableBuilder extends HTML_Constants{
	


	 /**
	  * @param header
	  * @param border
	  * @param rows
	  * @param columns
	  */
	 public HTMLTableBuilder(String header, boolean border, int rows, int columns) {
	  this.columns = columns;
	  if (header != null) {
	   table.append("<b>");
	   table.append(header);
	   table.append("</b>");
	  }
	  table.append(HTML_START);
	  table.append(border ? TABLE_START_BORDER : TABLE_START);
	  table.append(TABLE_END);
	  table.append(HTML_END);
	 }


	 /**
	  * @param values
	  */
	 public void addTableHeader(String... values) {
	  if (values.length != columns) {
	   System.out.println("Error column lenth");
	  } else {
	   int lastIndex = table.lastIndexOf(TABLE_END);
	   if (lastIndex > 0) {
	    StringBuilder sb = new StringBuilder();
	    sb.append(ROW_START);
	    for (String value : values) {
	     sb.append(HEADER_START);
	     sb.append(value);
	     sb.append(HEADER_END);
	    }
	    sb.append(ROW_END);
	    table.insert(lastIndex, sb.toString());
	   }
	  }
	 }


	 /**
	  * @param values
	  */
	 public void addRowValues(String... values) {
	  if (values.length != columns) {
	   System.out.println("Error column lenth");
	  } else {
	   int lastIndex = table.lastIndexOf(ROW_END);
	   if (lastIndex > 0) {
	    int index = lastIndex + ROW_END.length();
	    StringBuilder sb = new StringBuilder();
	    sb.append(ROW_START);
	    for (String value : values) {
	     sb.append(COLUMN_START);
	     sb.append(value);
	     sb.append(COLUMN_END);
	    }
	    sb.append(ROW_END);
	    table.insert(index, sb.toString());
	   }
	  }
	 }


	 /**
	  * @return
	  */
	 public String build() {
	  return table.toString();
	 }
	
	 /**
	  * @param args
	 * @throws IOException 
	  */
	 @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	 
	  
	  HTML_Constants H=new HTML_Constants();
	  System.out.println( H.read_data(1, 1));
	  int lw,i;
	  lw=H.last_row();
	  System.out.println(lw);
	  HTMLTableBuilder htmlBuilder = new HTMLTableBuilder(null, true, lw, 2);
	  
	  htmlBuilder.addTableHeader("Testcase", "Status");
	  for (i=1;i<=lw;i++)
	  {
	  htmlBuilder.addRowValues(H.read_data(i, 0), H.read_data(i, 2));
	   
	  }
	  String table = htmlBuilder.build();
	  BufferedWriter bw = null;
		FileWriter fw = null;
		fw = new FileWriter(Path_html);
		bw = new BufferedWriter(fw);
		bw.write(table.toString());
		System.out.println(table);
		System.out.println("Done");		
	  System.out.println(table.toString());
	 }
}
