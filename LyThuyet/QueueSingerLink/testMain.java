import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLink queue = new QueueLink();

        queue.endQueue(10);
        System.out.print("Add value to back queue: ");
        queue.endQueue(sc.nextInt());
        System.out.print("Add value to back queue: ");
        queue.endQueue(sc.nextInt());

        int del = queue.delQueue();
        System.out.println("Value is deleted: " + del);

        int peek = queue.peek();
        System.out.println("List after del front: " + peek);

        sc.close();
    }
}
