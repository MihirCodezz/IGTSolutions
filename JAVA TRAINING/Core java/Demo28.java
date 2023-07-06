import java.util.*;
class A
{
	A()
	{
		Date d = new Date();
		System.out.println(d);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		//LocalDate.of(2015, 02, 20);
		//LocalDate.parse("2015-02-20");
		
		
		
	}
}
public class Demo28
{
	public static void main(String args[])
	{
		A a = new A();
	}
}