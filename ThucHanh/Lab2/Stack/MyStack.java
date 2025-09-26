package Stack;
import java.util.NoSuchElementException;

public class MyStack<E> implements StackInterface<E> {
    private Node<E> top;
    private int numNode;
    public MyStack() {
        top = null;
        numNode = 0;
    }

    @Override
    public void push(E item) {
        top = new Node<E>(item, top);
        numNode++;
    }

    @Override
    public E pop() throws NoSuchElementException{
        if(top == null) 
            throw new NoSuchElementException("Can't pop element from empty stack");
    
        E item = top.getData();
        top = top.getNext();
        numNode--;

        return item;
    }

    @Override
    public int size() {
        return numNode;
    }

    @Override
    public boolean contains(E item) {
        Node<E> tmp = top;
        while(tmp != null) {
            if (tmp.getData().equals(item)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public void print() {
        if (top != null) {
            Node<E> tmp = top;
            System.out.print("Stack: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
        else {
            System.out.println("Stack is empty!");
        }
    }

    @Override
    public boolean isEmpty() {
        if(numNode == 0 ) return true;
        return false;
    }

    @Override
    public E getPeek() throws NoSuchElementException{
        if (top == null) 
            throw new NoSuchElementException("Can't peek from empty stack!");

        return top.getData();
    }
}
