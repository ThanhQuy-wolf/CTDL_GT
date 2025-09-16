public class BubbleSort {
    public static void sort(MyLinkedList<Integer> list) {
        if (list.isEmpty() || list.size() <= 1)
            return;

        boolean swapped;
        do {
            Node<Integer> curr = list.getHead();
            swapped = false;
            while (curr.getNext() != null) {
                if (curr.getData() > curr.getNext().getData()) {
                    int temp = curr.getData();
                    curr.setData(curr.getNext().getData());
                    curr.getNext().setData(temp);
                    
                    swapped = true;
                }
                curr = curr.getNext();
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(5);
        list.addLast(2);
        list.addLast(7);
        list.addLast(1);
        list.addLast(8);
        list.addLast(9);
        list.addLast(4);
        list.addLast(3);
        list.addLast(6);

        sort(list);
        list.print();
    }
}
