package Java_Practice;

public class stringbuffertest {

	public static void main(String[] args) {
		int c;
		StringBuffer s=new StringBuffer("Test");
		s.append("Hi");
		s.substring(6);
		c=s.length();
		System.out.println(s);
		System.out.println(c);
	}

}
