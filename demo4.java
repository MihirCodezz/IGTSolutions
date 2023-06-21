class Demo4
{
    public static void main(String args[])
    {
        System.out.println("Demo4 Class");\
        A a = new A();
        a.display();
    }
}
class A
{
    int uid;String name;int age;int salary;String desig;
    A()
    {
       Scanner sc=new Scanner(System.in);

       System.out.print("Enter the ID ?");
       uid=sc.nextInt();
       System.out.print("Enter the Name ?");
       name=sc.nextInt();
       System.out.print("Enter the Age ?");
       age=sc.nextInt();
       System.out.print("Enter the Salary ?");
       salary=sc.nextInt();
       System.out.print("Enter the Designation ?");
       desig=sc.nextInt();
    }

    void display()
    {
        System.out.println("ID :"+uid);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+desig);
    }
}