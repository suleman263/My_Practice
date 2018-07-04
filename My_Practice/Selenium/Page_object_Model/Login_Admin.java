package Page_object_Model;

public class Login_Admin extends POM_OR{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login_Admin l=new Login_Admin();
		l.open_url();
		l.user_name().sendKeys("admin@phptravels.com");
	}

}
