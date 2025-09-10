public class QueueLink {
    private class Node {
        int data;
        Node next;
        Node(int data) {this.data = data;}
    }

    private Node front;
    private Node back;
    private int size;

    public QueueLink() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void endQueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = newNode;
            back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
        size++;
    }

    public int delQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        int value = front.data;
        front = front.next;
        size--;
        
        if (front == null) {
            back = null;
        }

        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        return front.data;
    }
}