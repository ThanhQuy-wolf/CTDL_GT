import java.util.Scanner;

public class Ex1 {
    public static float factorial(int n) {
        int resul = n;
        if (n == 0 || n == 1) return 1;
        for (int i = n - 1; i >= 1; i--) {
            resul *= (n - i);
        }
        return resul;
    }

    public static float calculateTheExponent(float x, float n) {
        float resul = x;
        if (n == 0) return 1;
        if (n == 1) return x;
        while (n > 1) {
            resul = resul * x;
            n--;
        }
        return resul;
    }

    public static int countOfDigits(int n) {
        int count = 1;
        if (n < 10) return count;
        while (n > 10) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static boolean checkPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int findGCD(int a, int b) {
        int tmp = 0;
        while (a > 0) {
            tmp = a;
            a = b % a;
            b = tmp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Câu a
        System.out.print("Ex 1a: Factorial of n: ");
        int nFactorial = sc.nextInt();
        System.out.println("Ex 1a: Result: " + factorial(nFactorial));
        
        // Câu b
        System.out.println("Ex 1b: Enter x and n:");
        System.out.print("x = ");
        float x = sc.nextFloat();
        System.out.print("n = ");
        float nExponent = sc.nextFloat();
        System.out.println("Ex 1b: Result: " + calculateTheExponent(x, nExponent));
        
        // Câu c
        System.out.println("Ex 1c: Count number of digits:");
        System.out.print("Enter number: ");
        int nCountDigits = sc.nextInt();
        System.out.println("Ex 1c: Result: " + countOfDigits(nCountDigits));

        // Câu d
        System.out.println("Ex 1d: Check prime number:");
        System.out.print("Enter number: ");
        int nPrimeNumber = sc.nextInt();
        System.out.println("Ex 1d: Result: " + checkPrime(nPrimeNumber));

        // Câu e
        System.out.println("Ex 1e: Find GCD:");
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        System.out.println("Ex 1e: Result: " + findGCD(a, b));

        sc.close();
    }
}