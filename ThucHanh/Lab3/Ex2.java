import java.util.Scanner;

public class Ex2 {
    public static float factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static float calculateTheExponent(float x, float n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        return x * calculateTheExponent(x, n - 1);
    }

    public static int countOfDigits(int count, int n) {
        if (n > 10) {
            return countOfDigits(count + 1 , n / 10);
        }
        return count;
    }

    public static boolean checkPrime(int n, int index) {
        if (n < 2) return false;
        if (index <= n / 2) {
            if (n % index == 0) return false;
            return checkPrime(n, index + 1);
        }
        return true;
    }

    public static int findGCD(int a, int b) {
        if (a == 0) return b;
        
        return findGCD(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Câu a
        System.out.print("Ex 2a: Factorial of n: ");
        int nFactorial = sc.nextInt();
        System.out.println("Ex 2a: Result: " + factorial(nFactorial));
        
        // Câu b
        System.out.println("Ex 2b: Enter x and n:");
        System.out.print("x = ");
        float x = sc.nextFloat();
        System.out.print("n = ");
        float nExponent = sc.nextFloat();
        System.out.println("Ex 2b: Result: " + calculateTheExponent(x, nExponent));
        
        // Câu c
        System.out.println("Ex 2c: Count number of digits:");
        System.out.print("Enter number: ");
        int nCountDigits = sc.nextInt();
        int resultCountDigits = 2;
        System.out.println("Ex 2c: Result: " + countOfDigits(resultCountDigits, nCountDigits));

        // Câu d
        System.out.println("Ex 2d: Find GCD:");
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        System.out.println("Ex 2d: Result: " + findGCD(a, b));

        sc.close();
    }
}