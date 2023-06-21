class A
{
    A()
    {
        System.out.println("A Class");
    }
    void abc()
    {
        System.out.println("ABC Method");
    }
}
class Demo6
{
    private static void main(String args[]) 
    {
        A a = new A();// always try to create only once
        a.abc();
        a.abc();
        a.abc();// methods can call multiple times
    }
}