package Selenium_Practice;

interface test_sample_interface
{
	int test();
}


public class sample_interface implements test_sample_interface{

	public int test()
	{
return 3;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_sample_interface t=new sample_interface();
		System.out.println(t.test());
	}

}
