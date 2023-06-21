import java.util.Scanner;

class Clerk {
    Scanner read = new Scanner(System.in);
    int id;
    String name;
    int age;
    double salary;
    String designation;

    Clerk() {
        System.out.println("Enter Clerk details:");
        System.out.print("ID: ");
        id = read.nextInt();
        read.nextLine(); // Consume the newline character
        System.out.print("Name: ");
        name = read.nextLine();
        System.out.print("Age: ");
        age = read.nextInt();
        System.out.print("Salary: ");
        salary = read.nextDouble();
        read.nextLine(); // Consume the newline character
        System.out.print("Designation: ");
        designation = read.nextLine();
    }

    void display() {
        System.out.println("Clerk Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

class Dev extends Clerk {
    Dev() {
        System.out.println("Enter Developer details:");
        System.out.print("ID: ");
        id = read.nextInt();
        read.nextLine(); // Consume the newline character
        System.out.print("Name: ");
        name = read.nextLine();
        System.out.print("Age: ");
        age = read.nextInt();
        System.out.print("Salary: ");
        salary = read.nextDouble();
        read.nextLine(); // Consume the newline character
        System.out.print("Designation: ");
        designation = read.nextLine();
    }
}

class Manager extends Clerk {
    Manager() {
        System.out.println("Enter Manager details:");
        System.out.print("ID: ");
        id = read.nextInt();
        read.nextLine(); // Consume the newline character
        System.out.print("Name: ");
        name = read.nextLine();
        System.out.print("Age: ");
        age = read.nextInt();
        System.out.print("Salary: ");
        salary = read.nextDouble();
        read.nextLine(); // Consume the newline character
        System.out.print("Designation: ");
        designation = read.nextLine();
    }
}

class Tester extends Clerk {
    Tester() {
        System.out.println("Enter Tester details:");
        System.out.print("ID: ");
        id = read.nextInt();
        read.nextLine(); // Consume the newline character
        System.out.print("Name: ");
        name = read.nextLine();
        System.out.print("Age: ");
        age = read.nextInt();
        System.out.print("Salary: ");
        salary = read.nextDouble();
        read.nextLine(); // Consume the newline character
        System.out.print("Designation: ");
        designation = read.nextLine();
    }
}

class Project {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        clerk.display();

        System.out.println();

        Dev dev = new Dev();
        dev.display();

        System.out.println();

        Manager manager = new Manager();
        manager.display();

        System.out.println();

        Tester tester = new Tester();
        tester.display();
    }
}
