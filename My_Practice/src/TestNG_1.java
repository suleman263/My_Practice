import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_1 {
	@Test
	  public void f() {
		  System.out.println(1);
		 
		  
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		 
		  System.out.println(2);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println(3);
		  
}
}
