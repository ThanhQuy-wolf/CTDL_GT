public class BubbleSort {
    public static void sort(MyLinkedList<Integer> list) {
        if (list.isEmpty())
            return;

        boolean swapped;
        do {
            swapped = false;
            Node<Integer> current = list.getHead();
            while (current.getNext() != null) {
                if (current.getData() > current.getNext().getData()) {
                    int temp = current.getData();
                    current.setData(current.getNext().getData());
                    current.getNext().setData(temp);
                    swapped = true;
                }
                current = current.getNext();
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(5);
        list.addLast(1);
        list.addLast(6);
        list.addLast(2);
        list.addLast(8);
        list.addLast(7);
        list.addLast(4);
        list.addLast(9);
        list.addLast(3);

        sort(list);
        list.print();
    }
}
