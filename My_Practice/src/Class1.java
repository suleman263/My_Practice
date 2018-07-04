abstract class c
{
	abstract void  a();
	abstract void  b();
}
public class Class1 extends c{
	void a() {
		// TODO Auto-generated method stub
		System.out.println("A Running");
	}
	void b()
	{
		System.out.println("B Running");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
c c1=new Class1();
c1.a();
c1.b();
	}

		

}
