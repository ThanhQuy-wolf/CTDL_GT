import java.util.Scanner;

public class Ex4 {
    static long sumEx1(int i, int n) {
        if (i > n)
            return 0;
        return (2 * i + 1) + sumEx1(i + 1, n);
    }

    static long fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    static long sumEx2(int n) {
        if (n <= 1)
            return 1;
        return sumEx2(n - 1) + fact(n);
    }

    static long productEx3(int n) {
        if (n <= 1)
            return 1;
        return productEx3(n - 1) * fact(n);
    }

    static long combinationRecursive(int n, int k) {
        if (k < 0 || k > n) return 0;
        if (k == 0 || k == n) return 1;
        return combinationRecursive(n - 1, k) + combinationRecursive(n - 1, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Ex 4a: Enter n: ");
        int nOfEx1 = sc.nextInt();
        System.out.println("Result of ex 4a: " + sumEx1(1, nOfEx1));

        System.err.print("Ex 4b: Enter n: ");
        int nOfEx2 = sc.nextInt();
        System.out.println("Result of ex 4b: " + sumEx2(nOfEx2));

        System.err.print("Ex 4c: Enter n: ");
        int nOfEx3 = sc.nextInt();
        System.out.println("Result of ex 4c (product factorials): " + productEx3(nOfEx3));

        System.err.print("Ex 4d: Enter n: ");
        int n = sc.nextInt();
        System.err.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Result of ex 4d: " + combinationRecursive(n, k));


        sc.close();
    }
}