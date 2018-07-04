
public class Prac_This {


	int l,b,a;

Prac_This(int l,int b)
{
	this.l=l;
	this.b=b;
}
void area()
{
	a=l*b;
	System.out.println(a);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prac_This T=new Prac_This(22,31);
		T.area();

	}

}
