public class MaxNo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 5;
        
        int max = findMax(num1, num2, num3);
        
        System.out.println("The maximum of the three numbers is: " + max);
    }
    
    public static int findMax(int a, int b, int c) {
        int max = a;
        
        if (b > max) {
            max = b;
        }
        
        if (c > max) {
            max = c;
        }
        
        return max;
    }
}
