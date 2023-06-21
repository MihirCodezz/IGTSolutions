import java.util.*;
class A
{
    Scanner sc= new Scanner(System.in);
    A()
    {
        System.out.println("A()");
    }
    void abc()
    {
        a
        b
        c
        System.out.println("abc()");
    }
}
class Demo6
{
    private static void main(String args[]) 
    {
        A a = new A();// always try to create only once
        a.abc();
    }
}

// Constructor                          method

// A(){}                                same + other name also

// no return type                       must have return type

// always try create once               utilize with multiple time

// internally it allocate the memory    but no memory
                                            // it just utilize same memory