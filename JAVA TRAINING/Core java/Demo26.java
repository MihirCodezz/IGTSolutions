class Emp
{
	class Insert
	{
		Insert()
		{
			System.out.println("Insert  class ");
		}
		void abc()
		{
			System.out.println("Insert  class  abc method");	
		}
	}
	class Display
	{
		Display()
		{
			System.out.println("Display class ");
		}
		void xyz()
		{
			System.out.println("Display class xyz method ");
		}
	}
}
class Demo26
{
	public static void main(String args[])
	{
		System.out.println("HI Demo26 ");
		Emp e1= new Emp();
		Emp.Insert i = e1.new  Insert();
		i.abc();

		Emp e2= new Emp();
		Emp.Display d=e2.new Display();
		d.xyz();
	}
}