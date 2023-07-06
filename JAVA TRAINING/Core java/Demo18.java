class A
{
	void draw()
	{
		System.out.println("Draw () method");
	}	
	void draw(int a)
	{
		System.out.println("Draw () method : "+ (a * a ));
	}	
	void draw(int l, int b)
	{
		System.out.println("Draw () method : "+ (l * b ));
	}	
}
class Demo18
{
	public static void main(String args[])	
	{
		A a = new A();
		a.draw();
		a.draw(10);
		a.draw(10,20);
	}
}
// over loding ? 
//same constutor name  + multiple time + with diferect paramanter + in same class=is called Constructor ovr loding

//same method name  + multiple time + with diferect paramanter + in same class=is called method ovr loding
