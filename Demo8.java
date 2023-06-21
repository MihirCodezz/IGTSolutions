class A
{
    int a1= 100;
    void abc(int a1)
    {
        System.out.println("Hiii A Class"+this.a1);
        System.out.println("Hiii A Class"+a1);
    }
    }
class Demo8
{
    private static void main(String args[]) 
    {
        A a = new A();
        a.abc(1000);
    }
}