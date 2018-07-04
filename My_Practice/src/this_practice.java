
public class this_practice {
	int l,b,h,a,v;
	void area(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void volume(int h)
	{
		this.h=h;
	}
	
	 int area()
	{
		return(l*b);
	}
	
	void print()
	{
		
		System.out.println(l);
		System.out.println(b);
		System.out.println(h);
	}
	public static void main(String[] args) {
		int a2;
		this_practice t=new this_practice();
		t.area(212, 312);
		t.volume(421);
		a2=t.area();
		System.out.println(a2);
		t.print();
		t.area();
		
}
}
