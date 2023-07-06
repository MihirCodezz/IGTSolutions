class A
{
	public void display()
	{
		System.out.println("Hiiiiiiiiii");
	}	
}
class B extends A 
{
	public void display()
	{
		// same method name but different implementation in child class ....!:  over riding
		System.out.println("Helooooooo");
	}
}
class Demo19
{
	public static void main(String args[])	
	{
		B b = new B();
		b.display();
	}
}