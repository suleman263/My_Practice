import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Sample_Table extends JFrame {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void TableExample()
	    {
	        //headers for the table
	        String[] columns = new String[] {
	            "Id", "Name", "Hourly Rate"
	        };
	         
	        //actual data for the table in a 2d array
	        Object[][] data = new Object[][] {
	            {1, "John", 40.0},
	            {2, "Rambo", 70.0},
	            {3, "Zorro", 60.0},
	        };
	      
	        //create table with data
	        JTable table = new JTable(data, columns);
	         
	        //add the table to the frame
	        this.add(new JScrollPane(table));
	         
	        this.setTitle("Table Example");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	        this.pack();
	        this.setVisible(true);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample_Table s=new Sample_Table();
		s.TableExample();
	}

}
