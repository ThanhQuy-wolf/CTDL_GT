package Queue;

public class Test {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        queue.print();
    }
}
