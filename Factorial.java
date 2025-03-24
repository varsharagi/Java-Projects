import java.util.Scanner;

public class Factorial {
    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Calculate factorial
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
