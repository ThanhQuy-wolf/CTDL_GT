package Stack;

public class Node<E> {
    private E element;
    private Node<E> next;

    public Node() {
        element = null;
        next = null;
    }

    public Node(E data) {
        this(data, null);
    }

    Node(E data, Node<E> next) {
        this.element = data;
        this.next = next;
    }

    public E getData() {
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> curr) {
        next = curr;
    }

    public void setData(E data) {
        element = data;
    }
}
