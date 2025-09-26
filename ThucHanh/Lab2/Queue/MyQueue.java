package Queue;
import java.util.NoSuchElementException;

public class MyQueue<E> implements QueueInterface<E> {
    private Node<E> front;
    private Node<E> rear;
    private int numNode;
    public MyQueue() {
        front = null;
        rear = null;
        numNode = 0;
    }

    @Override
    public void enQueue(E item) {
        Node<E> newNode = new Node<>(item, null);
        if(front == null) {
            front = rear = newNode;
        }
        else {
            rear.setNext(newNode);
            rear = newNode;
        }
        numNode++;
    }

    @Override
    public E deQueue() throws NoSuchElementException {
        if (front == null)
            throw new NoSuchElementException("Can't delete from empty queue");

        E item = front.getData();
        front = front.getNext();
        if (front == null) rear = null;
        numNode--;
        return item;
    }

    @Override
    public int size() {
        return numNode;
    }

    @Override
    public void print() {
        if (front != null) {
            Node<E> tmp = front;
            System.out.print("Queue: " + front.getData());
            tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
        else {
            System.out.println("Queue is empty!");
        }
    }

    @Override
    public boolean contains(E item) {
        Node<E> tmp = front;
        while (tmp != null) {
            if (tmp.getData().equals(item)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(numNode == 0) return true;
        return false;
    }

    @Override
    public E getFront() {
        return front.getData();
    }
}
