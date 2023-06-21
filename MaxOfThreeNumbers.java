import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static int findMax(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int max = findMax(num1, num2, num3);

        System.out.println("The maximum of the three numbers is: " + max);
    }
}
