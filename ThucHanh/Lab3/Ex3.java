import java.util.Scanner;

public class Ex3 {
    public static boolean checkPrime(int n, int index) {
        if (n < 2)
            return false;
        if (index <= n / 2) {
            if (n % index == 0)
                return false;
            return checkPrime(n, index + 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ex 3: Check prime number:");
        System.out.print("Enter number: ");
        int nPrimeNumber = sc.nextInt();
        System.out.println("Ex 3: Result: " + checkPrime(nPrimeNumber, 2));
        sc.close();
    }
}
