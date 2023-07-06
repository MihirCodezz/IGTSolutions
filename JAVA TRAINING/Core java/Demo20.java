class Bank
{
	public int loan()
	{
		return 8;
	}	
}
class SBI extends Bank
{
}
class Axix extends Bank
{
	public int loan()
	{
		// same method name but different implementation in child class ....!:  over riding
		return 10;
	}
}
class Demo20
{
	public static void main(String args[])	
	{
		SBI s= new SBI();
		System.out.println(s.loan()+ " % ");

		Axix a= new Axix();
		System.out.println(a.loan()+ " % ");
	}
}
