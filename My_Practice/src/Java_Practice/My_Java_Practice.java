package Java_Practice;

public class My_Java_Practice {
 int l,b,a;
	void init(int x,int y)
	{
		l=x;
		b=y;
	}
 
 int area()
 {
	 a=l*b;
	 return(a);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Java_Practice P1=new My_Java_Practice();
		P1.init(22,32);
		int p2=P1.area();
		System.out.println(p2);

	}

}
