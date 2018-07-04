
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_Parameter {
	
	
	@Parameters({"admin"})
	@Test	
public void display(String admin)
{
	System.out.println(admin);
}
}
