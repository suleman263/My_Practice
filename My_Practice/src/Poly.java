
public class Poly {
int l,b,h;
void poly(int x,int y)
{
	l=x;
	b=y;
}
void poly(int x,int y,int z)
{
	l=x;
	b=y;
	h=z;
}
int area()
{
	return(l*b);
}
int vol()
{
	return(l*b*h);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1,a2;
Poly p=new Poly();
p.poly(1, 2);
p.poly(1, 2,4);
a1=p.area();
a2=p.vol();
System.out.println(a1);
System.out.println(a2);
	}

}
