/**
 * 
 */
/**
 * @author P7165387
 *
 */
package Parent_Pack;

class cal
{
	int z;
	void add(int x,int y)
	{
		z=x+y;
		System.out.println("The sum of the given numbers:"+z);
	}
	void mul(int x,int y)
	{
		z=x*y;
		System.out.println("Multiplication of the given numbers:"+z);
	}
}
public class Heritance_prac extends cal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
a=10;
b=11;
Heritance_prac p1=new Heritance_prac();
p1.add(a, b);
p1.mul(a, b);
	}

}