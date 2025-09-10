import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        stack.push(10);
        System.out.print("Enter new value on top: ");
        stack.push(sc.nextInt());
        System.out.print("Enter new value on top: ");
        stack.push(sc.nextInt());
        int value = stack.peek();
        System.out.println("Value on top now: " + value);
        int del = stack.pop();
        System.out.println("Value on top after delete: " + del);

        sc.close();
    }
}
