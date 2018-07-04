
public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("unused")
int a,b;
a=2;
long i;
try
{
	i=Thread.currentThread().getId() ;
	b=6/3;
	System.out.println(i);
}
catch(Exception e)
{
	System.out.println("Infiinity");
}
System.out.println("2nd execution");
	}


}
