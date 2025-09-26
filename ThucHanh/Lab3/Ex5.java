import java.util.Scanner;

public class Ex5 {
    static String convertDecimalToBinary(int n) {
        if (n == 0) return "";
        return convertDecimalToBinary(n / 2) + n % 2;
        
    }
    
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Convert decimal to binary: " + convertDecimalToBinary(decimal));

        sc.close();
    }
}
